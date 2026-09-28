package cinema;

public class VIPTicket extends Ticket {

    public VIPTicket(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void buy(double price) {
        System.out.println("VIP ticket selected.");
        paymentMethod.pay(price + 3000);
    }
}