package edu.sandiego.comp305;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(final double amount, final int years,
                           final Bank bank) {
        super(amount, years, bank);
    }

    @Override
    public InvestmentResult calculateGrowth() {
        return null;
    }
}
