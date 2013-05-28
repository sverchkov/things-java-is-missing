/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.isp.sverchkov.collections;

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
}
