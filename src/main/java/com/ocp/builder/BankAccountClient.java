package com.ocp.builder;

public class BankAccountClient {

    public static void main(String[] args) {



    BankAccount account = new BankAccount.Builder(1234L)
            .withOwner("Marge")
            .atBranch("Springfield")
            .openingBalance(100)
            .atRate(2.5)
            .build();

        System.out.println(account);

    }
}
