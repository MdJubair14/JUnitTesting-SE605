package com.jubair.KingMoves;

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
public class KingMovesTest {
    private KingMoves kingMoves;
    private String input;
    private int output;

    public KingMovesTest(String input, int output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        kingMoves = new KingMoves();
        kingMoves.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testSolve() throws Exception {
        Assert.assertEquals("King in ", kingMoves.solve(), output);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"a1", 3});
        params.add(new Object[]{"h1", 3});
        params.add(new Object[]{"e1", 5});
        params.add(new Object[]{"a7", 5});

        return params;
    }
}