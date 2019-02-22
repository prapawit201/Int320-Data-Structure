/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6Tree;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author INT320
 */
public class BalancedTree {

    public static void main(String[] args) {
        Set<Student> x = new TreeSet(new StudentComparator());
        x.add(new Student(1, "A"));
        x.add(new Student(2, "B"));
        x.add(new Student(3, "C"));
        System.out.println(x);
        Student st = new Student(3, "c");
        System.out.println(x.contains(st));
    }

}

class StudentComparator implements Comparator<Student> {

    public StudentComparator() {
    }

    @Override
    public int compare(Student s1, Student s2) {
        return -s1.getName().compareTo(s2.getName()); //ใช้เฉพาะnameในการรเทียบเเทน ถ้ามี-จะไล่หลังมาหน้า ถ้าไม่มีจะไล่หน้าไปหลัง
    }
}

class Student implements Comparable<Student> {

    private int id;
    private String name;

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    public Student() {
    }

    public Student(int id, String name) {
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

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

}
