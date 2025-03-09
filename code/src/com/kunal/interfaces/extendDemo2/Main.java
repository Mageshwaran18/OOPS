package com.kunal.interfaces.extendDemo2;

public class Main implements A, B {


    // the fun method is defined in both A and B interfaces , 
    // then the class implementing both the interface has to override the method
    @Override
    public void fun() {
        System.out.println("I am in Main");
    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
