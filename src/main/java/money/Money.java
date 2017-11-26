package money;

class Money {
    protected int amount;
    protected String currency;
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }
    String currency() {
        return currency;
    }
    public boolean equals(Object object) {
        Money money = (Money)object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public String toString() {
        return amount + " " + currency;

    }

}
