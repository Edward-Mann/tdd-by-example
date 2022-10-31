package guru.springframework;

public class Sum implements Expression{
    Expression augmend;
    Expression addmend;

    public Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String toNewCurrency) {
        int amount = augmend.reduce(bank, toNewCurrency).amount + addmend.reduce(bank, toNewCurrency).amount;
        return new Money(amount, toNewCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augmend.times(multiplier), addmend.times(multiplier));
    }


}
