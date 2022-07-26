package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionForEach {
    public static void main(String[] args) {
        List ls = new ArrayList<>();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        ls.add("e");

        ls.forEach((n)->System.out.println(n));
    }

}
