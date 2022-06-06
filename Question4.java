package com.company;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("This program show use of while loop");
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name to print");
        String name=in.next();
        System.out.println("how many time to print");
        int no=in.nextInt();
        int i=0;
        while (i<no){
            System.out.println((i+1)+"  "+name);
            i++;
        }

    }
}
