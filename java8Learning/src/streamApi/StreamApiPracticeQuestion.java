package streamApi;

import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiPracticeQuestion {

    public static List evenNumber(List<Integer> number){
        ArrayList al=new ArrayList();
        number.stream().filter(n-> n%2==0).forEach(n->al.add(n));
        return al;
    }

    public static List squaringEvenNumber(List<Integer> number){
        ArrayList al=new ArrayList();
        number.stream().filter(n-> n%2==0).map(n->n*2).forEach(n->al.add(n));
        return al;
    }

    public static String longeststring(List<String> name){

       return name.stream().max((s1,s2) -> Integer.compare(s1.length(),s2.length())).orElse("null");
    }

    public static List distinctNumber(List<Integer> number){
        ArrayList al=new ArrayList();
        number.stream().distinct().forEach(n -> al.add(n));
        return al;
    }

    public static List countLengthString(List<String> name){
        ArrayList al=new ArrayList();
        name.stream().map(n->n.length()).forEach(n->al.add(n));
        return al;
    }

    public static Map<Character,Long> countOccurrenceOfEachCharacter(String name){
        Map<Character,Long> map= name.chars().mapToObj(n->(char) n )
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        return map;

    }

    //from a list of names, give me the total number of letters in all the names with more than 5 letters
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... name) {

        return (Stream.of(name)
                .filter(n -> n.length() > 5)
                .mapToInt(n -> n.length())
                .sum()
        );
    }


    }


