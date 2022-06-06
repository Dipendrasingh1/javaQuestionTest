package com.company;
import java.util.Scanner;


public class Question3 {
    public static void main(String[] args) {
        System.out.println("This program accept the string &give the length of string");
        System.out.println("enter the sting ");
        Scanner in =new Scanner(System.in);
        String a=in.next();
        int count=0;
        for (int i=0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                count=count+1;
            }
        }
        System.out.println("length of string is "+count);



    }
}
