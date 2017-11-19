package money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money)object;
        return amount == money.amount;
    }
}
