package com;
import java.util.*;

//1. Print all even numbers till n.
public class homeworks {
    public static void main (String [] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
    // for(int i = 0; i <= n; i++){
    //     if(i%2==0){
    //         System.out.println(i);
    //     }

//2. 
// for (; ; ) {
//     System.out.println("ushudha");

// 3.  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)


 int choose;
 do {
     System.out.println("Enter 1 to continue and 0 to stop");
     choose = sc.nextInt();
     if (choose == 1) {
         System.out.println("Enter marks from 0 to 100");
         int marks = sc.nextInt();
         if (marks >= 90) {
             System.out.println("This is Good");
         } else if (marks >= 60) {
             System.out.println("This is also good");
         } else if (marks >= 0) {
             System.out.println("This is good as well");
         }
     }
 } while (choose == 1);
    }
}








