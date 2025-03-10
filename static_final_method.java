class Parent {

    static final void fun() {
        System.out.println("Parent final method");
    }


    static  void show() {
        System.out.println("Parent static method");
    }

    static void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {

    // @Override --> Error!
    static void show() {  // Not overriding, but hiding
        System.out.println("Child static method");
    }

    // Error! Cannot override final method

    // static final fun ()
    // {
    //     System.out.println("Child final method");
    // }
}

public class static_final_method {

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();  // Calls Parent's show() (not Child's!)
        Child obj1 = new Child();
        obj1.show();  // Calls Child's show()
        obj1.display();  // Calls Parent's display() // you can inherit but youcan't override
    }
}
