package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ex: men/women \nsex:");
        String ss = sc.next();
        System.out.println("age:");
        int age = sc.nextInt();
        if(ss.equalsIgnoreCase("men")){
            if(age>=18){
                System.out.println("yes,he can get marry");
            }else{
                System.out.println("no,no he can't get marry");
            }
        }else if(ss.equalsIgnoreCase("women")){
            if(age>=16){
                System.out.println("yes,she can get marry");
            }else{
                System.out.println("no,she can't get marry");
            }
        }else{
            System.out.println("wrong sex");
        }
    }
}