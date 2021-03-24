package en;

import java.util.Scanner;
public class calc4 {
        public static void main(String[] args){
       System.out.println("Welcome to the Calc program!");
       System.out.println("Enter 1st and 2nd numbers");
       System.out.println("Action - division");
       Scanner scan1 = new Scanner(System.in);
       int a = scan1.nextInt();
       Scanner scan2 = new Scanner(System.in);
       int b = scan2.nextInt();
       int c = a / b;
       System.out.println(a + ":" + b + "=" + c);
        
        }
    
}