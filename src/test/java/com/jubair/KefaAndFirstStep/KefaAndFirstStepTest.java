package com.jubair.KefaAndFirstStep;

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
public class KefaAndFirstStepTest {

    private KefaAndFirstStep kefaAndFirstStep;
    private String input;
    private int output;

    public KefaAndFirstStepTest(String input, int output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        kefaAndFirstStep = new KefaAndFirstStep();
        kefaAndFirstStep.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testSolve() throws Exception {
        Assert.assertEquals("Kefa's first step ", kefaAndFirstStep.solve(), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"0", 1});
        params.add(new Object[]{"1 5", 1});
        params.add(new Object[]{"2 5 6", 2});
        params.add(new Object[]{"2 7 6", 1});

        return params;
    }
}