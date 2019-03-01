/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7HashTable.map;

/**
 *
 * @author INT320
 */
public class wordFrequency implements Comparable<wordFrequency>{
    private String word;
    private int count ;

    public wordFrequency(String word) {
        this.word = word;
        this.count =1;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }
    public void increment(){
        count++;
    }

    @Override
    public int compareTo(wordFrequency o) {
        return this.word.compareTo(o.word);
    }
    
}
