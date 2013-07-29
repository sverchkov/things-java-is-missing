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
    
    private static final List<Double> logFactorials = new ArrayList<>( Arrays.asList( 0.0, 0.0 ) );
    
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
     * Sums a (varargs) array of <tt>int</tt>s.
     * @param array of <tt>int</tt>s
     * @return the sum
     */
    public static int sum( int... array ){
        int sum = 0;
        for( int n : array ) sum += n;
        return sum;
    }
    
    /**
     * Memoized ln( n! )
     * @param n
     * @return ln( n! )
     */
    public static double lnFactorial( int n ){
        int last = logFactorials.size()-1;
        if( n > last ){
            double lf = logFactorials.get( last );
            while( last < n )
                logFactorials.add( lf += Math.log( ++last ) );
            return lf;
        }
        return logFactorials.get(n);
    }
    
    /**
     * Returns ln( x + y ) given ln x and ln y. More numerically stable than ln( exp( lnX ) + exp( lnY ) ).
     * @param lnX ln x
     * @param lnY ln y
     * @return ln( x + y )
     */
    public static double lnXplusY( double lnX, double lnY ){
        if( Double.isNaN(lnX) || Double.isNaN(lnY) ) return Double.NaN;
        if( lnX == Double.NEGATIVE_INFINITY ) return lnY;
        if( lnY == Double.NEGATIVE_INFINITY ) return lnX;
        if( lnX == Double.POSITIVE_INFINITY || lnY == Double.POSITIVE_INFINITY ) return Double.POSITIVE_INFINITY;
        // wlog x <= y
        if( lnX > lnY ) return lnXplusY( lnY, lnX );
        // ln( x + y ) = ln(x) + ln( 1 + exp( ln(y) - ln(x) ) )
        return lnX + Math.log1p( Math.exp( lnY - lnX ) );
    }
}
