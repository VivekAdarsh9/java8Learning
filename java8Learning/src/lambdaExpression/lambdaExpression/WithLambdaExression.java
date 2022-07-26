package lambdaExpression;

interface Employee1 {
    public void characteristics();
}

public class WithLambdaExression {

    public static void main(String[] args) {
        Employee1 e = () -> {
            System.out.println("Employee Character");
        };
        e.characteristics();
    }


}
