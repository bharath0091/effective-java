package hashAndEqual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsInList {

    public static void main(String... args) {
        //contains in List
        Student student1 = new Student("Bharath", "ch");
        Student student2 = new Student("Kumar", "ch");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        assert -242215929 == student1.hashCode();
        assert -2036381871 == student2.hashCode();

        assert true == students.contains(new Student("Bharath", "ch"));
        assert false == students.contains(new Student("xx", "ch"));

        //contains in Set





        Map<Student, String> studentsMap = new HashMap<>();
        studentsMap.put(student1, "Bharath");
        studentsMap.put(student2, "Kumar");

        System.out.println("studentsMap.size() :" + studentsMap.size());
        System.out.println("studentsMap.get(new hashAndEqual.Student(\"Bharath\", \"ch\") :" + studentsMap.get(new Student("Bharath", "ch")));
        System.out.println("studentsMap.get(new hashAndEqual.Student(\"XX\", \"ch\") :" + studentsMap.get(new Student("XX", "ch")));

        //About char
        char a = '2';
        int b = a;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
