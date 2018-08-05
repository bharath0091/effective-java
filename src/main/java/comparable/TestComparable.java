package comparable;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {

    public static void main(String... args) {
        List<String> names = Arrays.asList("Kumar", "Bharath", "Ch");
        Set<String> namesSet = new TreeSet<>();
        namesSet.addAll(names);
        assert namesSet.toString().equals("[Bharath, Ch, Kumar]");
    }
}
