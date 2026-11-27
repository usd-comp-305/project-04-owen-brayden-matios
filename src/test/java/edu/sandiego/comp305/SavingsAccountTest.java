package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    @Test
    void testCalculateGrowth() {
        Bank bank = new fakeBank(Map.of("saving", 0.05));
        SavingsAccount account = new SavingsAccount(430.0, 5, bank);

        InvestmentResult result = account.calculateGrowth();

        assertEquals(118.001, result.getFinalBalance(), 0.001);
        assertEquals(548.801, result.getTotalInterest(), 0.001);

    }

}