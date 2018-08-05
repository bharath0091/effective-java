package containsInSetDefaultHashCode;

import java.util.Random;

public class Student {
    private String firstName;
    private String lastName;
    private static Random random = new Random(1000);

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
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj != null && obj instanceof Student) {
            Student otherStudent = (Student) obj;
            isEqual = this.firstName.equals(otherStudent.firstName) &&
                    lastName.equals(otherStudent.lastName);
        }
        return isEqual;
    }

//    @Override
//    public int hashCode() {
//        int hash = random.nextInt();
//        return hash;
//    }

    @Override
    public String toString() {
        return super.toString();
    }
}
