package edu.sandiego.comp305;

public class CarLoan extends Loan {
    public CarLoan(final double purchasePrice,
                   final double downPaymentAmount,
                   final int years, final Bank bank) {
        super(purchasePrice, downPaymentAmount, years, bank);
    }
}
