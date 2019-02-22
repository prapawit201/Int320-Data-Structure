/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6Tree;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author INT320
 */
public class BalancedTree {
    public static void main(String[] args) {
        Set<String> x = new TreeSet();
        x.add("A");
        x.add("B");
        x.add("C");
        x.add("D");
        x.add("E");
        x.add("F");
        x.add("G");
        x.add("H");
        System.out.println(x);
        System.out.println(x.contains("G"));
    }
}
