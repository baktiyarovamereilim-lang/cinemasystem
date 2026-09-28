package test;

import cinema.PaymentMethod;
import cinema.StandardTicket;
import cinema.VIPTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTest {

    static class TestPayment implements PaymentMethod {
        double paidAmount;

        @Override
        public void pay(double amount) {
            paidAmount = amount;
        }
    }

    @Test
    void standardTicketUsesOriginalPrice() {
        TestPayment payment = new TestPayment();
        StandardTicket ticket = new StandardTicket(payment);

        ticket.buy(5000);

        assertEquals(5000, payment.paidAmount);
    }

    @Test
    void vipTicketAddsExtraPrice() {
        TestPayment payment = new TestPayment();
        VIPTicket ticket = new VIPTicket(payment);

        ticket.buy(5000);

        assertEquals(8000, payment.paidAmount);
    }
}