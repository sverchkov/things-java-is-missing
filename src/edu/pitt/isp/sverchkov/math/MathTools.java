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
    
    public static double sum( Iterable<Double> nums ){
        double sum = 0;
        for( double num : nums ) sum += num;
        return sum;
    }
}
