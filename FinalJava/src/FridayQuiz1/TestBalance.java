/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FridayQuiz1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Windows10
 */
public class TestBalance {

    public static String checkSymbol(String input) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        map.put('“', '”');
        LinkedList<Character> stack = new LinkedList<>();
        char charr[] = input.toCharArray();
        for (char c : charr) {
            if (map.keySet().contains(c)) {
                stack.push(c);
            } else if (map.values().contains(c)) {
                if (stack.isEmpty() || map.get(stack.peek()) != c) {
                    return "Output : false";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "Output : true";
        }
        return "Output : false";
    }

    public static void main(String[] args) {
        String input[] = new String[3];
        input[0] = "“{[{}{}]}” “[]{}()” ";
        input[1] = "“{()}[]” “{(})”";
        input[2] = "“{[{}[]{}]}” “[]{}()”ABCDEFG";
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Input : " + input[i]);
            System.out.println(checkSymbol(input[i]));
        }
    }

}

