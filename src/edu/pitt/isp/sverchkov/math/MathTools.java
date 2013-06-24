/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.isp.sverchkov.math;

/**
 *
 * @author YUS24
 */
public class MathTools {
    
    //TODO public static int sum( int[] array ){        
    //}
    
    /**
     * Sums a (presumably finite) iterable of doubles.
     * @param nums the things to sum
     * @return the sum as a double
     * @throws NullPointerException if any element in nums is null.
     */
    public static double sum( Iterable<? extends Number> nums ){
        double sum = 0;
        for( Number num : nums ) sum += num.doubleValue();
        return sum;
    }  
}
