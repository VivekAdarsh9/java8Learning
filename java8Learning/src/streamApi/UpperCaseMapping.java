package streamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseMapping {

    public static Collection<String> mapToUpperCase(String... names) {
        return (
                Stream.of(names)
                        .map(n-> n.toUpperCase())
                        .collect(Collectors.toList())
        );
    }
}
