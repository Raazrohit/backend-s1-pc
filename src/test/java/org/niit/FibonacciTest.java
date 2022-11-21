package org.niit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    Fibonacci fibonacci;
    @Before
    public void setUp(){
        fibonacci = new Fibonacci();
    }
    @After
    public void tearDown(){
        fibonacci = null;
    }
    @Test
    public void checkIfFibonacci(){
        int fbSeries[] = fibonacci.fibonacci(6);
        int expected[] = {0,1,1,2,3,5};
        Assert.assertArrayEquals(expected,fbSeries);
    }
    @Test
    public void checkIfNotFibonacci(){
        int fbSeries[] = fibonacci.fibonacci(6);
        int expected[] = {0,1,1,2,3,8};
        Assert.assertNotEquals(expected,fbSeries);
    }
}
