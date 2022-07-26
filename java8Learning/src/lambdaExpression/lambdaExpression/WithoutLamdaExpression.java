package lambdaExpression;
interface Employee {

    public void charcteristics();
}

public class WithoutLamdaExpression {
    public static void main(String[] args) {

        Employee e = new Employee() {

            public void charcteristics() {
                System.out.println("Employee Characteristics");
            }
        };

        e.charcteristics();

    }
}
