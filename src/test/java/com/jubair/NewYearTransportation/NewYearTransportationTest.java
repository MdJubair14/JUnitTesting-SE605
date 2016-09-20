package com.jubair.NewYearTransportation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by jubair on 9/20/16.
 */
@RunWith(Parameterized.class)
public class NewYearTransportationTest {

    private NewYearTransportation newYearTransportation;
    private String input;
    private String output;

    public NewYearTransportationTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        newYearTransportation = new NewYearTransportation();
        newYearTransportation.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testRun() throws Exception {
        Assert.assertEquals("Output ", newYearTransportation.run(), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"1 1", "YES"});
        params.add(new Object[]{"1 0", "NO"});
        params.add(new Object[]{"2 4 3", "YES"});

        return params;
    }
}