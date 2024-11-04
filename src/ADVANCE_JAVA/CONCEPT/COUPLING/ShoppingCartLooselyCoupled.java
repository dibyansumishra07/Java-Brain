package ADVANCE_JAVA.CONCEPT.COUPLING;

public class ShoppingCartLooselyCoupled {
    private PaymentProcessor paymentProcessor;

    public ShoppingCartLooselyCoupled(PaymentProcessor paymentProcessor) { // Dependency Injection
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout() {
        paymentProcessor.processPayment();
    }
}
