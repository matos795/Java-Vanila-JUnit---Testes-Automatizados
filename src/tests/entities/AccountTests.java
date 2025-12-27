package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount(){

        double amount = 200.0;
        double expectedValue = 196.0;
        Account ac = new Account(1L, 0.0);

        ac.deposit(amount);

        Assertions.assertEquals(expectedValue, ac.getBalance());
    }
}
