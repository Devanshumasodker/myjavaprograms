package Basicproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

// we need to implement Comparable interface for creating custom comparator.
class Employee implements Comparable<Employee>{

    private int EmloyeeId;

    public Employee(int id){
        this.EmloyeeId = id;

    }

    public int getId(){
        return this.EmloyeeId;
    }

    // we override toString method.
    public String toString(){
        return "Employee -> " + getId();
    }

    //  Custom comparator
    public int compareTo(Employee otherEmployee) {
        return this.getId() - otherEmployee.getId();
    }
}

public class SortLinkedHashSetExample {

    interface A{
        int method(int a,int b);
    }

    public static void main(String[] args) {

        LinkedHashSet<Employee> SetOfEmployees = new LinkedHashSet<Employee>();
        SetOfEmployees.add( new Employee(3) );
        SetOfEmployees.add( new Employee(1) );
        SetOfEmployees.add( new Employee(2) );

        //Custom Data
        List<Employee> listUsers = new ArrayList<Employee>( SetOfEmployees );
//   int a=9;
//   int b=8;
        int [] Arr = {1,3,4,5,5};

        String s = "jam am ka";
//        s.replace("am(.)",was);


  A cb= (a,b)->a+b;
        System.out.println(cb.method(8,9));
        A cd= (a,b)->a*b;
        System.out.println(cd.method(8,9));
        Collections.sort(listUsers);

        System.out.println(listUsers);

    }
}
