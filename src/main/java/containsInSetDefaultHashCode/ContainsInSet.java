package containsInSetDefaultHashCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsInSet {

    public static void main(String... args) {
        //contains in List
        Student student1 = new Student("Bharath", "ch");
        Student student2 = new Student("Ku", "ch");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);

        //This is mostly false because the hashcode is mostly different for every new Object
        assert false == students.contains(new Student("Bharath", "ch"));


    }
}
