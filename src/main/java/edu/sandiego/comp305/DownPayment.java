package edu.sandiego.comp305;

public abstract class DownPayment implements Investment {
    private double purchasePrice;
    private double downPaymentAmount;
    private int years;
    private double loanRate;

    @Override
    public abstract Result calculateGrowth();

    public double calculateMonthlyPayment() {
        return 0.0;
    }
}
