package ru;

import java.util.Scanner;
public class calc1 {
    public static void main(String[] args){
    System.out.println("Добро пожаловать в программу Calc!");
   System.out.println("введите 1 и 2 число");
   System.out.println("Действие - сложение");
   Scanner scan1 = new Scanner(System.in);
   int a = scan1.nextInt();
   Scanner scan2 = new Scanner(System.in);
   int b = scan2.nextInt();
   int c = a + b;
   System.out.println(a + "+" + b + "=" + c);
    
    }
    
}
