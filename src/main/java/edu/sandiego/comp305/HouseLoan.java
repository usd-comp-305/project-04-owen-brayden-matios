package edu.sandiego.comp305;

public class HouseLoan extends Loan {
    public HouseLoan(final double purchasePrice,
                     final double downPaymentAmount,
                     final int years, final Bank bank) {
        super(purchasePrice, downPaymentAmount, years, bank);
    }
}
