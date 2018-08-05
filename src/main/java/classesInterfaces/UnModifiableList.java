package classesInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableList
{

    public static void main(String... args) {
        List<String> list = new ArrayList<>();
        List<String> unModifiebleList = Collections.unmodifiableList(list);
        unModifiebleList.add("bk");
    }
}
