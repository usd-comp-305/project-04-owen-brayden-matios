package edu.sandiego.comp305;

import java.util.Map;

public abstract class Bank {
    private String name;
    private Map<String, Double> rates;

    public Bank(String name, Map<String, Double> rates){
        this.name = name;
        this.rates = rates;
    }

    public String getName(){
        return name;
    }

    public double getRate(String accountType){
        Double rate = rates.get(accountType);
        if(rate == null){
            throw new IllegalArgumentException("Account type " + accountType + " is not a valid account type.");
        }
        return rate;
    }
}
