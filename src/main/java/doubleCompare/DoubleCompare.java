package doubleCompare;

public class DoubleCompare {
    public static void main(String... args) {
        double a = 0.0/0.0; //becomes Nan as the values are floating point
        a = 0.0/0; //becomes Nan as the values are floating point
        double b = 2.7/0;
        System.out.println(a);
        System.out.println(b);


        assert Double.compare(a, b) == 0;
        assert a == b; //fails as Nan and


        double c = 0/0; // throws errors arithmetic exception


        //TODO
        // See page 47 to find out why we use compare instead of ==
//        return Double.compare(c.re, re) == 0
//
//                && Double.compare(c.im, im) == 0;
    }
}
