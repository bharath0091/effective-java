package hashAndEqual;

public class Student {
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
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }


    @Override
    public String toString() {
        return super.toString();
    }
}
