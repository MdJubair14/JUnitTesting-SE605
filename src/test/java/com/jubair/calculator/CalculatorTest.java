package com.jubair.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by jubair on 9/20/16.
 */
@RunWith(Parameterized.class)
public class CalculatorTest {
    private Calculator calculator;
    private String input;
    private int output;

    public CalculatorTest(String input, int output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"5 10 1", 15});
        params.add(new Object[]{"10 5 2", 5});
        params.add(new Object[]{"5 5 3", 25});
        params.add(new Object[]{"40 5 4", 8});
        params.add(new Object[]{"10 20 10", -1});

        return params;
    }

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
        calculator.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testCalculate() throws Exception {
        Assert.assertEquals("Pass", output, calculator.calculate());
    }

    /*Calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();

    }

    @Test
    public void testCalculate() throws Exception {
        calculator.testRunner(new ByteArrayInputStream("5 10 1".getBytes()));
        Assert.assertEquals("Addition test", 15, calculator.calculate());

        calculator.testRunner(new ByteArrayInputStream("10 5 2".getBytes()));
        Assert.assertEquals("Addition test", 5, calculator.calculate());

        calculator.testRunner(new ByteArrayInputStream("5 5 3".getBytes()));
        Assert.assertEquals("Addition test", 25, calculator.calculate());

        calculator.testRunner(new ByteArrayInputStream("40 5 4".getBytes()));
        Assert.assertEquals("Addition test", 8, calculator.calculate());

        calculator.testRunner(new ByteArrayInputStream("10 2 10".getBytes()));
        Assert.assertEquals("Addition test", -1, calculator.calculate());
    }*/
}
