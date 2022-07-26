import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateList {

    public static void main(String[] args) {

        List<Integer> dupList = new ArrayList<>();
        dupList.add(7);
        dupList.add(4);
        dupList.add(5);
        dupList.add(4);
        dupList.add(5);
        dupList.add(2);

        Set<Integer> s=new HashSet<>();

        // dupList.stream().filter(n->!s.add(n)).forEach(System.out::println);
        dupList.stream().filter(n -> Collections.frequency(dupList, n) > 1).collect(Collectors.toSet()).forEach(System.out::println);

    }

}
