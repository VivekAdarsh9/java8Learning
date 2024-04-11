package streamApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateList {


    public void duplicateElementInList(List<Integer> list) {

        list.stream().
                filter(n -> Collections.frequency(list,n) > 1).
                collect(Collectors.toSet()).
                forEach(System.out::println);
    }

}
