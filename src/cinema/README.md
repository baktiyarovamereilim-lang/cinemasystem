# Cinema System — Bridge and Adapter Design Patterns

## Project Description

This project is a simple Cinema System developed in Java. It demonstrates the Bridge and Adapter design patterns.

Users can choose a ticket type and a payment method. The system supports Standard and VIP tickets, as well as Card, Kaspi, and Legacy payments.

## Design Patterns

### Bridge Pattern

The Bridge pattern separates ticket types from payment methods.

**Abstraction:**

* `Ticket`

**Refined Abstractions:**

* `StandardTicket`
* `VIPTicket`

**Implementor:**

* `PaymentMethod`

**Concrete Implementations:**

* `CardPayment`
* `KaspiPayment`

This allows different ticket types to work with different payment methods independently.

### Adapter Pattern

The Adapter pattern allows the new payment interface to work with an old payment system.

* `LegacyPaymentSystem` is the old payment system.
* `LegacyPaymentAdapter` adapts it to the `PaymentMethod` interface.

The adapter also translates legacy error codes into readable error messages.

## Features

* Choose Standard or VIP ticket.
* Choose Card, Kaspi, or Legacy payment.
* Select options at runtime.
* Calculate the VIP ticket price.
* Handle errors from the legacy payment system.

## Tests

The project uses JUnit 5.

The tests check:

* Standard ticket payment.
* VIP ticket payment.
* Legacy payment error translation.

## Technologies

* Java
* IntelliJ IDEA
* JUnit 5
* Git and GitHub

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open `Main.java`.
3. Click the Run button.
4. Follow the instructions in the console.

## How to Run Tests

1. Open the `test` package.
2. Run `TicketTest` and `LegacyPaymentAdapterTest`.
3. Check that all tests pass.

## Author

Cinema System Project
