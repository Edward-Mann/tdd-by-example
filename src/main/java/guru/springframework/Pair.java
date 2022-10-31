package guru.springframework;

import java.util.Objects;

public class Pair {
    private final String currentCurrency;
    private final String toNewCurrency;

    public Pair(final String currentCurrency, final String toNewCurrency) {
        this.currentCurrency = currentCurrency;
        this.toNewCurrency = toNewCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return currentCurrency.equals(pair.currentCurrency) && toNewCurrency.equals(pair.toNewCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentCurrency, toNewCurrency);
    }
}
