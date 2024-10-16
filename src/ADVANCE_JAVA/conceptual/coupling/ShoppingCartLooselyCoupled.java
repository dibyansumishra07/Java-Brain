package ADVANCE_JAVA.conceptual.coupling;

public class ShoppingCartLooselyCoupled {
    private PaymentProcessor paymentProcessor;

    public ShoppingCartLooselyCoupled(PaymentProcessor paymentProcessor) { // Dependency Injection
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout() {
        paymentProcessor.processPayment();
    }
}
