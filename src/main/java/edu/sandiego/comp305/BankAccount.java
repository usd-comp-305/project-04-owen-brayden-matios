package edu.sandiego.comp305;

public abstract class BankAccount implements Investment {
    private double amount;

    private int years;

    private Bank bank;

    @Override
    public abstract InvestmentResult calculateGrowth();
}
