/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.isp.sverchkov.collections;

/**
 *
 * @author YUS24
 */
public class ArrayTools {
    
    public static boolean contains( Object target, Object array[] ){
        return firstIndexOf( target, array ) != -1;
    }
    
    public static int firstIndexOf( Object target, Object array[] ){
        if( array != null )
            if( target == null ){
                for( int i=0; i<array.length; i++ )
                    if( array[i] == null ) return i;
            }else{
                for( int i=0; i<array.length; i++ )
                    if( target.equals( array[i] ) ) return i;
            }
        return -1;
    }
    
    public static int firstIndexOf( Object target, Iterable array ){
        if( array != null ){
            int i=0;
            if( target == null )
                for( Object o : array ){
                    if( o == null ) return i;
                    ++i;
                }
            else
                for( Object o : array ){
                    if( target.equals(o) ) return i;
                    ++i;
                }
        }
        return -1;
    }
}
