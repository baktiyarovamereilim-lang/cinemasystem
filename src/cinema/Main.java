package cinema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Cinema System!");

        System.out.println("Choose ticket type:");
        System.out.println("1. Standard");
        System.out.println("2. VIP");
        int ticketChoice = scanner.nextInt();

        System.out.println("Choose payment method:");
        System.out.println("1. Card");
        System.out.println("2. Kaspi");
        System.out.println("3. Legacy Payment");
        int paymentChoice = scanner.nextInt();

        PaymentMethod payment;

        if (paymentChoice == 1) {
            payment = new CardPayment();
        } else if (paymentChoice == 2) {
            payment = new KaspiPayment();
        } else {
            payment = new LegacyPaymentAdapter(
                    new LegacyPaymentSystem()
            );
        }

        Ticket ticket;

        if (ticketChoice == 1) {
            ticket = new StandardTicket(payment);
        } else {
            ticket = new VIPTicket(payment);
        }

        ticket.buy(5000);

        scanner.close();
    }
}