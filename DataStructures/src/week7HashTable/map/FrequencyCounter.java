/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7HashTable.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author INT320
 */
public class FrequencyCounter {

    Map<String, wordFrequency> frequency;

    public FrequencyCounter() {
        frequency = new HashMap(125);
    }

    public void process(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, " .:,;()*-/\\1234567890");//StringTokenizerเป็นตัวตัดคำถ้าเจอก็จะตัด
            while (stk.hasMoreElements()) {
                String word = stk.nextToken().toLowerCase();
                if (frequency.get(word) == null) {
                    frequency.put(word, new wordFrequency(word));
                } else {
                    frequency.get(word).increment();
                }
            }

        }
    }

    public void clear() {
        frequency.clear();
    }

    public String toString() {
        StringBuilder stb = new StringBuilder(frequency.size() * 20);
        List<wordFrequency> words = new ArrayList(frequency.values());
        Collections.sort(words);
        for (wordFrequency word: words ) {
            stb.append(String.format("%-15s:%3d\n", word.getWord(),word.getCount()));
        }
        return stb.toString();
    }
    public List<wordFrequency> getResult(){
        return new ArrayList(frequency.values());
    }
}
