package edu.sandiego.comp305;

public class InvestmentResult {
    private double finalBalance;
    private double totalInterest;

    public InvestmentResult(double finalBalance, double totalInterest) {
        this.finalBalance = finalBalance;
        this.totalInterest = totalInterest;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public double getTotalInterest() {
        return totalInterest;
    }
}