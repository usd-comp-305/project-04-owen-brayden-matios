package edu.sandiego.comp305;

public abstract class BankAccount implements Investment {
    private double amount;

    private int years;

    private Bank bank;

    public BankAccount(final double amount, final int years,
                       final Bank bank) {
        this.amount = amount;
        this.years = years;
        this.bank = bank;
    }

    public double getAmount() {
        return amount;
    }

    public int getYears() {
        return years;
    }

    public Bank getBank() {
        return bank;
    }

    @Override
    public abstract InvestmentResult calculateGrowth();
}
