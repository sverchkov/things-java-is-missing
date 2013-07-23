/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.isp.sverchkov.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author YUS24
 */
public class MathTools {
    
    private static final List<Double> logFactorials = new ArrayList<>();
    
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
    
    /**
     * Memoized ln( n! )
     * @param n
     * @return ln( n! )
     */
    public static double logFactorial( int n ){
        int last = logFactorials.size()-1;
        if( n > last ){
            double lf = logFactorials.get( last );
            while( last < n )
                logFactorials.add( lf += Math.log( ++last ) );
            return lf;
        }
        return logFactorials.get(n);
    }
}
