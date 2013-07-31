/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.isp.sverchkov.collections;

/**
 *
 * @author YUS24
 */
public interface Tuple<First, Rest extends Tuple<?,?>> {
    First getFirst();
    Rest getRest();
}
