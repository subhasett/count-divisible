package com.subha.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by if993886 on 16/04/2018.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testCountDivisibleWithFirstNumberAsNegative(){
        int result = solution.countDivisible(-1,new Random().nextInt(100000),new Random().nextInt(1000));
        Assert.assertEquals(0, result);
    }
    @Test
    public void testCountDivisibleWithFirstNumberBiggerThanUpperBound(){
        int result = solution.countDivisible(2000000001,new Random().nextInt(100000),new Random().nextInt(1000));
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCountDivisibleWithSecondNumberAsNegative(){
        int result = solution.countDivisible(new Random().nextInt(100000), -1, new Random().nextInt(1000));
        Assert.assertEquals(0, result);
    }
    @Test
    public void testCountDivisibleWithSecondNumberBiggerThanUpperBound(){
        int result = solution.countDivisible(new Random().nextInt(100000), 2000000001, new Random().nextInt(1000));
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCountDivisibleWithDivisorAsNegative(){
        int result = solution.countDivisible(new Random().nextInt(2), new Random().nextInt(200000), -1);
        Assert.assertEquals(0, result);
    }
    @Test
    public void testCountDivisibleWithDivisorBiggerThanUpperBound(){
        int result = solution.countDivisible(new Random().nextInt(2), new Random().nextInt(200000), 2000000001);
        Assert.assertEquals(0, result);
    }
    @Test
    public void testCountDivisibleWithBiggerFirstNumberThanSecond(){
        int result = solution.countDivisible(3000000, 20000, new Random().nextInt(10));
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCountDivisiblePositive(){
        int result = solution.countDivisible(6, 11, 2);
        Assert.assertEquals(3, result);
    }

}
