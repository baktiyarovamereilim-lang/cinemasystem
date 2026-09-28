package cinema;

public class StandardTicket extends Ticket {

    public StandardTicket(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void buy(double price) {
        System.out.println("Standard ticket selected.");
        paymentMethod.pay(price);
    }
}