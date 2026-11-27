package edu.sandiego.comp305;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(final double amount, final int years,
                          final Bank bank) {
        super(amount, years, bank);
    }

    @Override
    public InvestmentResult calculateGrowth() {
        return null;
    }
}
