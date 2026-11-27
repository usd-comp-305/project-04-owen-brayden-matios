package edu.sandiego.comp305;

public abstract class Loan {
    protected double purchasePrice;

    protected double downPaymentPrice;

    protected int years;

    protected Bank bank;

    public Loan (final double purchasePrice, final double downPaymentPrice,
                 final int years, final Bank bank) {
        this.purchasePrice = purchasePrice;
        this.downPaymentPrice = downPaymentPrice;
        this.years = years;
        this.bank = bank;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getDownPaymentPrice() {
        return downPaymentPrice;
    }

    public int getYears() {
        return years;
    }

    public Bank getBank() {
        return bank;
    }

    public InvestmentResult calculateResult(){
        return null;
    }

    public double calculateMonthlyPayment(){
        return 0.0;
    }
}
