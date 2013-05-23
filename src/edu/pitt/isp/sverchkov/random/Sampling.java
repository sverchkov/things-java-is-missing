package edu.pitt.isp.sverchkov.random;

import java.util.*;

/**
 *
 * @author YUS24
 */
public class Sampling {
    
    /**
     * Random sampling of a combination of k objects out of a list.
     * Based on Robert Floyd's algorithm.
     * @param <T> The type of the objects.
     * @param collection The list from which to sample.
     * @param k The number of objects to sample.
     * @param random The RNG object.
     * @return A new collection containing k objects from the list.
     */
    private static <T> Collection<T> sampleCombination( List<T> collection, int k, Random random ){
        
        final int n = collection.size();
        
        if( n <= k ) return collection;
        
        Set<T> result = new HashSet();
        for( int j = n - k; j < n; j++ ){
            
            final T item = collection.get( random.nextInt( j + 1 ) );
            
            if( result.contains( item ) )
                result.add( item );
            else
                result.add( collection.get(j) );
        }            
        return result;
    }
    
    private static <T> Collection<T> sampleCombination( List<T> collection, int k ){
        return sampleCombination( collection, k, new Random() );
    }
    
}
