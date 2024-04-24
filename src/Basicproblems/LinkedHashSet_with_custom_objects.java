package Basicproblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSet_with_custom_objects {
    public static void main(String[] args) {
        // Create a LinkedHashSet

        LinkedHashSet<Student> StudentSet = new LinkedHashSet<>();


        // Add persons to the set
        StudentSet.add(new Student(1, "Amit"));
        StudentSet.add(new Student(2, "Ankit"));
        StudentSet.add(new Student(3, "Abhishek"));
        StudentSet.add(new Student(1, "vikas"));
        System.out.println(StudentSet);
        // Printing the output
        for (Student student : StudentSet)
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());

    }
}

// custom object class
class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }



    // Override equals method for custom criteria
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

// overriding hasCod method
    public int hashCode() {
        return Objects.hash(id);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
