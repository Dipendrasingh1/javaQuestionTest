package com.company;
import java.util.Scanner;   //importing scanner class

public class Question2 {
    public static void main(String [] args){
        System.out.println("This program use switch case to add &sub no /n");

        Scanner in= new Scanner(System.in);   //objct making
        System.out.println("enter first no");
        int a=in.nextInt();                          //receiving no
        System.out.println("enter operator");
        String optr=in.next();                     //receiving String operator inside optr
        System.out.println("enter 2nd no");
        int b=in.nextInt();                       //receiving no
        switch (optr){                             //optr switch
            case "+":
                System.out.println("addition of a+b= "+a+b);
                break;
            case "-" :
                System.out.println("substraction of a-b ="+(a-b));
                break;
            case "*"  :
                System.out.println("multiplicarion of a*b="+ a*b);
                break;
        }
    }
}
