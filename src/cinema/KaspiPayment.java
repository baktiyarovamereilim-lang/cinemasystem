package cinema;

public class KaspiPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid by Kaspi: " + amount + " KZT");
    }
}