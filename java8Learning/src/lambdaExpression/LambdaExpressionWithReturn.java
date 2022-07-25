package lambdaExpression;

interface Calculate {

    public int add(int a,int b);
}

public class LambdaExpressionWithReturn {

    public static void main(String[] args) {
        Calculate c=(a,b)->{
            return a+b;
        };

        Calculate c1 = (a, b) -> (a + b);

        System.out.println(c.add(10, 20));
        System.out.println(c1.add(20, 30));
    }
}
