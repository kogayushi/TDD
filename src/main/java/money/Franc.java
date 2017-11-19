package money;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Money dollar = (Money)object;
        return amount == dollar.amount;
    }
}
