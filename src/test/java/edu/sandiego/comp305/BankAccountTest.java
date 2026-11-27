package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testRealValidAccount() {
        Bank bank = new ChaseBank();
        BankAccount account = new fakeBank(430.0, 5, bank);

        assertEquals(430.0, account.getAmount());
        assertEquals(5, account.getYears());
        assertEquals(bank, account.getBank());
    }
}