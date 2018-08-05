package clone;

import java.util.ArrayList;
import java.util.List;

public class TestClone {

    public static void main(String... args) {
        Student student = new Student("Bharath", "ch");
        Student studentClone = student.clone();
        assert  studentClone != null;
        assert  student != studentClone;
        assert  studentClone.getFirstName().equals("Bharath");
        assert  studentClone.getLastName().equals("ch");

//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Kumar", "ch"));
//        List<Student> studentListClone = studentList.cl // no CLONE menthod

        Student[] studentArray = {new Student("Kumar", "ch")};
        Student[] studentArrayClone = studentArray.clone();
        assert studentArrayClone != null;
        assert studentArrayClone != studentArray;
        assert studentArrayClone[0] == studentArray[0];

    }
}
