package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {


    @Test
    void times() {
        Money fiveDollars = Money.dollar(5);
        assertEquals(new Money(10, "USD"), fiveDollars.times(2));
    }

    @Test
    void DollarEqualities() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
    }
}