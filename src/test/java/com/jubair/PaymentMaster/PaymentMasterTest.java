package com.jubair.PaymentMaster;

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
public class PaymentMasterTest {

    private PaymentMaster paymentMaster;
    private String input;
    private double output;

    public PaymentMasterTest(String input, double output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        paymentMaster = new PaymentMaster();
        paymentMaster.testRunner(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testPaymentCalc() throws Exception {
        Assert.assertEquals("Payment ", paymentMaster.paymentCalc(), output, .00001);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[]{"10", 40});
        params.add(new Object[]{"-3", 0});
        params.add(new Object[]{"21", 38});
        params.add(new Object[]{"35", 90.5});
        params.add(new Object[]{"35555", 3278.25});

        return params;
    }
}