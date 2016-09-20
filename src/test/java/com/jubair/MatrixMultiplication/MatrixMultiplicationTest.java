package com.jubair.MatrixMultiplication;

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
public class MatrixMultiplicationTest {
    private MatrixMultiplication matrixMultiplication;
    private String input;
    private String output;

    public MatrixMultiplicationTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        matrixMultiplication = new MatrixMultiplication();
        matrixMultiplication.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testRun() throws Exception {
        Assert.assertEquals("Matrix Multiplication\n",matrixMultiplication.run(), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"1 2 1 2" + "1 2 " + "1 2", "Not Possible"});
        params.add(new Object[]{"2 2 2 2 " +
                                "2 3 5 7 " +
                                "3 4 5 6 ", "21 26\n50 62\n"});
        return params;
    }
}