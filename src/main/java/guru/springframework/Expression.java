package guru.springframework;

public interface Expression {
    Money reduce(Bank bank, String toNewCurrency);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}