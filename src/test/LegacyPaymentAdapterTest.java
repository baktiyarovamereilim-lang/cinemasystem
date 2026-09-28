package test;

import cinema.LegacyPaymentAdapter;
import cinema.LegacyPaymentSystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LegacyPaymentAdapterTest {

    @Test
    void adapterTranslatesLegacyError() {

        LegacyPaymentAdapter adapter =
                new LegacyPaymentAdapter(new LegacyPaymentSystem());

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> adapter.pay(0)
        );

        assertEquals(
                "Payment failed: invalid amount",
                exception.getMessage()
        );
    }
}