package tests;

import java.util.Date;

import model.Account;

public class AccountTests {

    public static void main(String[] args) {

        Account testAccount = new Account("1", "mike", "Saving", new Date());
        System.out.println(testAccount);

    }

}
