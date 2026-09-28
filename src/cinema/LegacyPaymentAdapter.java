package cinema;

public class LegacyPaymentAdapter implements PaymentMethod {

    private LegacyPaymentSystem legacySystem;

    public LegacyPaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void pay(double amount) {
        int result = legacySystem.makePayment((int) amount);

        if (result == 400) {
            throw new IllegalArgumentException("Payment failed: invalid amount");
        }

        if (result != 0) {
            throw new IllegalArgumentException("Payment failed");
        }
    }
}