package com;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testApp(){

        App app=new App("sam");
        Assert.assertEquals("sam",app.getName());

    }
}
