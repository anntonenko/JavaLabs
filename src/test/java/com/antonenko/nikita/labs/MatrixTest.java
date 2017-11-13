package com.antonenko.nikita.labs;


import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void testMinApi() throws Exception {
        Matrix laba5 = new Matrix();
        laba5.initRandom(1000, 10);
        Assert.assertEquals(laba5.min(),laba5.minApi());
    }

    @Test
    public void testMaxApi() throws Exception {
        Matrix laba5 = new Matrix();
        laba5.initRandom(1000, 10);
        Assert.assertEquals(laba5.max(),laba5.maxApi());
    }

}