package functionalInterface;

@FunctionalInterface
interface functionalInterface {
    public void test();

    public default void test1() {

        System.out.println("Default Method");
    }

    public static void test2() {
        System.out.println("Static Method");
    }

}

class FunctionalInterfaceDemo implements functionalInterface{

    public static void main(String[] args) {
        FunctionalInterfaceDemo fi = new FunctionalInterfaceDemo();
        fi.test();
        fi.test1();
        functionalInterface.test2();

    }

    @Override
    public void test() {
        System.out.println("Functional Interface");

    }

}
