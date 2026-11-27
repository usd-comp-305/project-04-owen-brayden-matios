package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    @Test
    void testAccurateGrowthRate() {
        Bank bank = new fakeBank(Map.of("checking", 0.01));
        CheckingAccount account = new CheckingAccount(430.0, 5, bank);

        InvestmentResult result = account.calculateGrowth();

        assertEquals(451.934, result.getFinalBalance(), 0.001);
        assertEquals(21.934, result.getTotalInterest(), 0.001);
    }

}