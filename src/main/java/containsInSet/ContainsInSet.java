package containsInSet;

import java.util.HashSet;
import java.util.Set;

public class ContainsInSet {

    public static void main(String... args) {
        //contains in List
        Student student1 = new Student("Bharath", "ch");
        Student student2 = new Student("Kumar", "ch");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);

        assert true == students.contains(new Student("Bharath", "ch"));
        //This is false because the hascode is
    }
}
