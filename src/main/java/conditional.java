
import java.util.*;

/* public class conditional {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //if (age>20){
            //System.out.println("Adult");
       // } else{
         //System.out.println("Not Adult");
        if(x % 2 ==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

} */


public class conditional{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Equal");
        }else if (a>b){
                System.out.println("a is greater");
        } else {
                System.out.println("b is greater");
            }
        }
    }