package hashAndEqual;

public class Equals {

    public static void main(String[] args) {
        Student student1 = new Student("Bharath", "Kumar");
        Student student2 = student1;
        System.out.println("student1 " + student1);
        System.out.println("student2 :" + student2);
        assert  student1 == student2;

    }
}
