/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author Windows10
 */
public class binarysearch {

    public static void main(String[] args) {
       int data[] = {1,2,3,4,5,6,7,8,9};
       int pos = binarySearchAns(data,6);
        System.out.println(pos);
    }
   public static int binarySearchAns(int data[],int i){
       int left = 0 ; 
       int right = data.length-1;
       int middle;
       while(left<=right){
           System.out.println("Left : "+left+" , Right : "+right);
           middle=(left+right)/2;
           if (left >data[middle]) {
               left = middle+1;
               System.out.println("New Left :" +left);
           }else if (right <data[middle]) {
               right = middle-1;
               System.out.println("New Right :"+right);
           }else{
               System.out.println("FInish");
               return middle;
           }
       }
       System.out.println("End");
       return -1;
   }


//        while (left <= right) {
//            middle = (left + right) / 2;
//            System.out.printf("L-%d is %d | M-%d is %d | R-%d is %d \n", left, data[left], middle, data[middle], right, data[right]);
//            if (i > data[middle]) {
//                System.out.printf("%d > %d \n", i, data[middle]);
//                left = middle + 1;
//                System.out.printf("New Left is m+1 = %d\n", left);
//            } else if (i < data[middle]) {
//                System.out.printf("%d < %d \n", i, data[middle]);
//                right = middle - 1;
//                System.out.printf("New Right is m-1 = %d\n", right);
//            } else {
//                System.out.printf("Can find %d in index %d\n", i, middle);
//                return middle;
//            }
//        }
//        System.out.println("<<<<<END>>>>>>");
//        System.out.println("Cannot Find key in data");
//        return -1;
    
}
