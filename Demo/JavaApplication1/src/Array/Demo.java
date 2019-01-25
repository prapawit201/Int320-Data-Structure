/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author INT320
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list =new LinkedList();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        
        list.add(2,"xxx");
       
        list.add("0");
        list.add("10");
    }
    
}
