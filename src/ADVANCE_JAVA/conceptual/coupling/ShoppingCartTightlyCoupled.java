package ADVANCE_JAVA.conceptual.coupling;

public class ShoppingCartTightlyCoupled {
    private PaymentProcessor paymentProcessor = new PaymentProcessor(); // Direct instantiation of dependency

    public void checkout() {
        paymentProcessor.processPayment(); // Direct method call
    }
}
