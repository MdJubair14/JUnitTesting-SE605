package com.jubair.Chocolate;

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
public class ChocolateTest {

    private Chocolate chocolate;
    private String input;
    private int output;

    public ChocolateTest(String input, int output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        chocolate = new Chocolate();
        chocolate.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testSolve() throws Exception {
        Assert.assertEquals("Answer ", chocolate.solve(), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"0", 0});
        params.add(new Object[]{"3 1 1 1", 1});
        params.add(new Object[]{"3 0 1 0", 1});
        params.add(new Object[]{"2 0 0", 0});

        return  params;
    }
}