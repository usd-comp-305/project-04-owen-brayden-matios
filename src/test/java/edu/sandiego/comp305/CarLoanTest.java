package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CarLoanTest {
    @BeforeEach
    void setUp() {
        Bank fakeBank = mock(Bank.class);
    }

    @Test
    void testCalculateResultIsNull() {
        Loan loan = new CarLoan(0.0,0.0,0,null);
        assertNull(loan.calculateResult());
    }

    @Test
    void calculateMonthlyPayment() {
        Loan loan = new CarLoan(0.0,0.0,0,null);
        assertEquals(0.0, loan.calculateMonthlyPayment());
    }
}

