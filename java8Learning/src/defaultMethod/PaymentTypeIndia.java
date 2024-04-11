package defaultMethod;

public interface PaymentTypeIndia {

    String paymentTypeField="UPI";

    void showPaymentType();
    default void showCARDPaymentType() {
        System.out.println("INDIA CARD PAYMENT TYPE");
    }
}
