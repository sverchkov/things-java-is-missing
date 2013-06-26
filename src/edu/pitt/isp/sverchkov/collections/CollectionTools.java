/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.isp.sverchkov.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YUS24
 */
public class CollectionTools {
    public static <K,V> Map<K,V> mapUnion( Map<K,V> m1, Map<K,V> m2 ){
        Map<K,V> result = new HashMap<>(m1);
        result.putAll(m2);
        return result;
    }
    
    public static <Key,Value> ArrayList<Value> applyMap( Map<? extends Key, ? extends Value> map, Key[] keys ){
        ArrayList<Value> result = new ArrayList<>();
        for( Key k : keys ) result.add( map.get(k) );
        return result;
    }

    public static <Key,Value> ArrayList<Value> applyMap( Map<? extends Key,? extends Value> map, Iterable<? extends Key> keys ){
        ArrayList<Value> result = new ArrayList<>();
        for( Key k : keys ) result.add( map.get(k) );
        return result;
    }
}
