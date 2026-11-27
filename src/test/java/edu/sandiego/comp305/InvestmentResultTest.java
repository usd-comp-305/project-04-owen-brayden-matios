package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentResultTest {

    @Test
    void testGetFinalBalance() {
        final InvestmentResult result = new InvestmentResult(100.0, 10.0);
        assertEquals(100.0, result.getFinalBalance());
    }

    @Test
    void getTotalInterest() {
        final InvestmentResult result = new InvestmentResult(100.0, 10.0);
        assertEquals(10.0, result.getTotalInterest());
    }
}
