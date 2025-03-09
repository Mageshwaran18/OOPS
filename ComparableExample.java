import java.util.*;

class Student implements Comparable<Student> {
    int rollno;
    int marks;

    Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        // Sorting in descending order
        return o.marks - this.marks; // Corrected
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Marks: " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, 100));
        list.add(new Student(2, 200));
        list.add(new Student(3, 300));
        list.add(new Student(4, 400));

        // Sorting using Comparable (Descending Order)
        Collections.sort(list);
        System.out.println("Descending Order Sorted List:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Sorting using Comparator (Ascending Order)
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.marks - o2.marks;
            }
        });

        System.out.println("\nAscending Order Sorted List (Using Comparator):");
        for (Student s : list) {
            System.out.println(s);
        }

        // Sorting using Lambda Expression (Ascending Order)
        list.sort((s1, s2) -> s1.marks - s2.marks);

        System.out.println("\nAscending Order Sorted List (Using Lambda):");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
