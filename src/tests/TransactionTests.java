package tests;

import java.util.Date;

import model.Transaction;

public class TransactionTests {

    public static void main(String[] args) {

        Transaction testTransaction = new Transaction("1", 100.00, new Date());
        System.out.println(testTransaction);

    }

}
