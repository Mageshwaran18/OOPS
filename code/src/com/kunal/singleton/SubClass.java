package com.kunal.singleton;

import com.kunal.access.A;

import java.util.ArrayList;
import java.util.Collections;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Kunal Kushwaha");
    //    int n = obj.num; --> protected in A , protected variables can be accessed within the package and only child class can access it outside the package
        SubClass obj2 = new SubClass(45, "Kunal Kushwaha");
        int n = obj2.num; // No error becuase it's the subclass of A

    }
}

class SubSubclass extends SubClass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "Kunal Kushwaha");
        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "Kunal Kushwaha");
       int n = obj.num; // No error becuase it's the subclass of A
    }
}