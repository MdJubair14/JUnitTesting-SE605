package com.jubair.GradeCalculator;

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
public class GradeCalculatorTest {

    private GradeCalculator gradeCalculator;
    private String input;
    private String output;

    public GradeCalculatorTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        gradeCalculator = new GradeCalculator();
        gradeCalculator.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testGradeCalc() throws Exception {
        Assert.assertEquals("Result ", gradeCalculator.gradeCalc(), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"35 40 40 40", "F"});
        params.add(new Object[]{"40 35 40 40", "F"});
        params.add(new Object[]{"50 50 35 50", "F"});
        params.add(new Object[]{"50 50 50 35", "F"});
        params.add(new Object[]{"82 82 83 85", "A"});
        params.add(new Object[]{"70 71 72 73", "B"});
        params.add(new Object[]{"61 62 63 64", "C"});
        params.add(new Object[]{"50 51 52 55", "D"});
        params.add(new Object[]{"45 46 47 48", "E"});
        params.add(new Object[]{"41 42 44 40", "F"});

        return params;
    }
}