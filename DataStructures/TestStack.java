/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5StackNQueue;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author INT320
 */
public class TestStack {
    public static void main(String[] args) {
        List list = new LinkedList();
        LinkedList<Integer> stack = new LinkedList();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int x = stack.pop();
            System.out.println(10*x);
        }
        System.out.println("Size : "+stack.size());
    }
}
