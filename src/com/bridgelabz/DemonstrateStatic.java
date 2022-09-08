package com.bridgelabz;

public class DemonstrateStatic {
    static int variable = 5;
    static void method(){
        System.out.println("It is a Static Method");
    }
    static {
        System.out.println("It is a Static Block");
    }
    public static void main(String[] args) {
        System.out.println(variable);
        method();
    }
}
