package com.jubair.CheckPoint;

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
public class CheckPointTest {

    private CheckPoint checkPoint;
    private String input;
    private int output;

    public CheckPointTest(String input, int output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        checkPoint = new CheckPoint();
        checkPoint.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testSolve() throws Exception {
        Assert.assertEquals("Checkpoint in ", checkPoint.solve(), output);

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"0 100", 0});
        params.add(new Object[]{"3 10 " + "1 7 12", 3});

        return params;
    }
}