package com.company;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("This program show use of ternary operator");
        System.out.println("enter the no to check wheather it is even");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String b=(a%2==0)? "no is even":"no is odd";
        System.out.println("Using ternary operator ->"+b);
    }
}
