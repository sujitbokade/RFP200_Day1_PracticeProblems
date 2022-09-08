package com.bridgelabz;

import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.next();
        System.out.println("Enter Second String");
        String str2 = sc.next();

        EqualityCheck equalityCheck = new EqualityCheck();
        equalityCheck.check(str1,str2);

    }
    public  void check(String str1, String str2){
        if(str1.equals(str2)){
            System.out.println("Both Strings are Equals");
        }
        else {
            System.out.println("Strings are Not Equals");
        }
    }
}
