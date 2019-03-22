/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7HashTable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author INT320
 */
public class TestHashSet {
    public static void main(String[] args) {
//        Set<String> s = new HashSet<>(); //ถ้าเรากำหนดcapacityมันจะจองที่ให้เลยจองตามที่เรากำหนดไว้
//        s.add("Cat");
//        s.add("Dog");
//        s.add("Bird");
//        s.add("Duck");
//        String x = new String("Cat");
//        System.out.println("Cat".hashCode());//hascode checkดูตำแหน่งทีข้อมูลอยุ่ในhash table
//        System.out.println(x.hashCode());
//        System.out.println(s.contains("Dog"));//containดูว่ามีข้อมูลที่ชื่อนี้เก็บอยุ่หรือป่าว
            testHashCode();
    }
    static void testHashCode(){
        Set<NewStudent>st = new HashSet<>();
        st.add(new NewStudent(1001, "SomChai"));
        st.add(new NewStudent(1002, "SomSri"));
        st.add(new NewStudent(1003, "SomKiet"));
        NewStudent ns = new NewStudent(1002, "SomSri");
        NewStudent ns2 = new NewStudent(1002, "SomSri");
        System.out.println(ns.hashCode());//hashcode ของตัวที่เก็บควรอยุ่ช่องเดียวกัน
        System.out.println(ns2.hashCode());
        System.out.println(st.contains(ns));
        
    }
}

    class NewStudent{
        private int id;
        private String name;
        

//        int hash = 5;//เป็นตัวเลขprime number เพราะเวลาเอาไป*จะได้เป็นuniqueึ่งถ้าเอาไปทำhashfunction ข้อมุลเดียวกันกจะอยุ่ช่องเดียวกัน
//        hash = 89 * hash + this.id;
//        hash = 89 * hash + Objects.hashCode(this.name);
//        return hash;
        
        public int hash(){
            int hash = 5;
            hash = 7*hash+this.id;
            hash = 7*hash+Objects.hashCode(this.name);
            return hash;
        }


        public boolean equals (Object obj){
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass()!= obj.getClass()) {
                return false;
            }
            final NewStudent st = (NewStudent) obj;
            if (this.id != st.id) {
                return false;
            }
            if (!Objects.equals(this.name, st.name)) {
                return false;
            }
            return true;
        }   
        
        

//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final NewStudent other = (NewStudent) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        return true;


        public NewStudent(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
    }
    

