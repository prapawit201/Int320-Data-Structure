/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9PiorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *
 * @author INT320
 */
public class TestpiorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue(20, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 02 - o1;
            }
        }); //กำหนดขนาดqueueว่า20 เเละใช้compareในนี้เลย
        Random r = new Random(); //random number
        for (int i = 0; i < 20; i++) {
            int x = r.nextInt(99);
            System.out.print(x + ", ");
            pq.add(x);
        }
        System.out.println("\b\b\n");
        System.out.println("Size : " + pq.size());
        System.out.println("First item in Queue : " + pq.peek());
        System.out.println(pq);//show item ใน queue ทั้งหมด
        System.out.println("--------------------\n");
        testApply();
    }

    private static void testApply() {
        PriorityQueue<Student> pq = new PriorityQueue();
        pq.add(new Student(1001, "A", 1.75));
        pq.add(new Student(1007, "C", 2.25));
        pq.add(new Student(1008, "D", 3.25));
        pq.add(new Student(1011, "E", 3.59));
        pq.add(new Student(1021, "F", 3.65));
        pq.add(new Student(1031, "G", 4.00));
        pq.add(new Student(1051, "H", 3.25));
        for (Student student : pq) {
            System.out.println(student.id + " : " + student.gpax);
        }
    }
}

class Student implements Comparable<Student> {

    int id;
    String name;
    double gpax;

    public Student(int id, String name, double gpax) {
        this.id = id;
        this.name = name;
        this.gpax = gpax;
    }

    @Override
    public int compareTo(Student o) {
        if (this.gpax < o.gpax) {
            return 1;
        } else if (this.gpax > o.gpax) {
            return -1;
        }
        return 0;
    }
}

//    private static class comparator implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer pq1, Integer pq2) {
//            return pq2 - pq1; //เอาตัวที่มากกว่ามาขึ้นหน้า
//        }
//
//    }
