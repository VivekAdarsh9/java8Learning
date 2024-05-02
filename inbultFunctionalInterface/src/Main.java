import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println(message);

        printMessage.accept("Vivek");
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // Convert the list to a stream, filter words that start with 'a', and print them
        words.stream()
                .filter(word -> word.startsWith("a"))  // Intermediate operation
                .forEach(System.out::println);


        Function<String, Integer> stringLength=s->s.length();

        System.out.println(stringLength.apply("Vivek"));

        Predicate<Integer> enenTest=n->n%2==0;

        System.out.println(enenTest.test(5));


        Supplier<Double> randomSupplier=()->Math.random();

        System.out.println(randomSupplier.get());

    }
    }