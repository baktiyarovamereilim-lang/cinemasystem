package cinema;

public abstract class Ticket {

    protected PaymentMethod paymentMethod;

    public Ticket(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void buy(double price);
}