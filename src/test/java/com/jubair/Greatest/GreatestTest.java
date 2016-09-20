package com.jubair.Greatest;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by jubair on 9/20/16.
 */
@RunWith(Parameterized.class)
public class GreatestTest {

    private Greatest greatest;
    private String input;
    private String output;

    public GreatestTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        greatest = new Greatest();
        greatest.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testGreatestFinder() throws Exception {
        Assert.assertEquals("Greatest is ", greatest.greatestFinder(), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> param = new ArrayList<>();

        param.add(new Object[]{"5 4 3", "X"});
        param.add(new Object[]{"5 4 6", "Z"});
        param.add(new Object[]{"5 6 3", "Y"});
        param.add(new Object[]{"5 6 7", "Z"});

        return param;
    }
}