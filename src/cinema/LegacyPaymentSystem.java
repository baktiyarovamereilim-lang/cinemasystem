package cinema;

public class LegacyPaymentSystem {

    public int makePayment(int amount) {
        if (amount <= 0) {
            return 400;
        }

        System.out.println("Legacy system processed payment: " + amount + " KZT");
        return 0;
    }
}