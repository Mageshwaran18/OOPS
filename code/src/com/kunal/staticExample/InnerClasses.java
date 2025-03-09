package com.kunal.staticExample;

import java.util.Arrays;

public class InnerClasses {

    static class Test {
        String name;
        int age;      
        public Test(String name) {
            this.name = name;
            this.age = 10;
        }

        // Error: The return type is incompatible with Object.toString()
        // toString() must return String, not int
        @Override
        public String toString() {
            return String.valueOf(age);
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

       System.out.println(a);
       System.out.println(a.name);
       System.out.println(b.name);
    }
}

//static class A {
//
//}