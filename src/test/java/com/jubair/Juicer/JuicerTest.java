package com.jubair.Juicer;

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
public class JuicerTest {
    private Juicer juicer;
    private String intput;
    private int output;

    public JuicerTest(String intput, int output) {
        this.intput = intput;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        juicer = new Juicer();
        juicer.testRunner(new ByteArrayInputStream(intput.getBytes()));
    }

    @Test
    public void testSolve() throws Exception {
        Assert.assertEquals("Juicer output ", juicer.solve(), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"0 5 10", 0});
        params.add(new Object[]{"1 3 4 5", 0});
        params.add(new Object[]{"1 3 8 5", 0});
        params.add(new Object[]{"2 7 10 5 6", 1});

        return params;
    }
}