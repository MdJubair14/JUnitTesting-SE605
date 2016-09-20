package com.jubair.PrimeFinder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by jubair on 9/20/16.
 */
@RunWith(Parameterized.class)
public class PrimeFinderTest {

    private PrimeFinder primeFinder;
    private int input;
    private boolean output;

    public PrimeFinderTest(int input, boolean output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        primeFinder = new PrimeFinder();
    }

    @Test
    public void testCheckPrime() throws Exception {
        Assert.assertEquals("The number is ", primeFinder.checkPrime(input), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{4, false});
        params.add(new Object[]{3, true});
        params.add(new Object[]{5, true});

        return params;
    }
}