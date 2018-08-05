package clone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Cloneable{
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public Student clone() {
        return new Student("", "");
//        try {
//            return (Student) super.clone();
        /*} catch (CloneNotSupportedException e) {
            e.printStackTrace();
            //THIS will never occur as this class implements Cloneable
            throw new AssertionError();
        }*/
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj != null && obj instanceof Student) {
            Student otherStudent = (Student) obj;
            isEqual = this.firstName.equals(otherStudent.firstName) &&
                    lastName.equals(otherStudent.lastName);
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return lastName.chars()
                .map(character -> (int)character)
                .mapToObj(String::valueOf)
                .reduce((a, b) -> a + b)
                .map(a -> {
                    /**
                     * 2147483647
                     * 7511710997114
                     *
                     */
                    List list  = new ArrayList();
                    list.contains(null);
                    Objects.equals(null, null);

                    Student sdnt = null;
                    System.out.println("null instanceof  Student :" + (sdnt instanceof Student));

                    System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
                    System.out.println("combined character Ascii value : " + a);
                    return a;
                })
                .map(Integer::valueOf)
                .get();
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
