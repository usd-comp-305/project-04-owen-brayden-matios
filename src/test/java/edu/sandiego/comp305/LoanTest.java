package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void testCalculateResultIsNull() {
        final Loan loan = new CarLoan(0.0,0.0,0,null);
        assertNull(loan.calculateResult());
    }

    @Test
    void calculateMonthlyPayment() {
        final Loan loan = new HouseLoan(0.0,0.0,0,null);
        assertEquals(0.0, loan.calculateMonthlyPayment());
    }
}

