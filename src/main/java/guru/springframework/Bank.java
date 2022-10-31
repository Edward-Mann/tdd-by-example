package guru.springframework;

import java.util.HashMap;

public class Bank {
    private HashMap<Pair, Integer> rateMap = new HashMap<Pair, Integer>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public void addRate(String fromCurrency, String toCurrency, int rate) {
        rateMap.put(new Pair(fromCurrency, toCurrency), rate);
    }
    public int rate(String currentCurrency, String toNewCurrency) {
        if(currentCurrency.equals(toNewCurrency)) return 1;
        return rateMap.get(new Pair(currentCurrency, toNewCurrency));
    }
}
