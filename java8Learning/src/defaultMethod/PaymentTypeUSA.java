package defaultMethod;

public interface PaymentTypeUSA {

    default void showCARDPaymentType(){
        System.out.println("USA CARD PAYMENT TYPE");
    }
}
