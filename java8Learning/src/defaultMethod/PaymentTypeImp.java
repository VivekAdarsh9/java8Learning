package defaultMethod;

import java.io.ObjectOutputStream;

public class PaymentTypeImp implements PaymentTypeIndia,PaymentTypeUSA{

    @Override
    public void showPaymentType() {
        System.out.println(PaymentTypeIndia.paymentTypeField);
    }

    @Override
    public void showCARDPaymentType() {
        PaymentTypeIndia.super.showCARDPaymentType();
        PaymentTypeUSA.super.showCARDPaymentType();
    }
}