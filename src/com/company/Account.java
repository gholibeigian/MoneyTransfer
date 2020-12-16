package com.company;

public class Account {
    ///test2
    // We do not need test here. We need action!
    private int AccountNumber;
    private String AccountType;

    public Account(int accountNumber, String accountType) {
        AccountNumber = accountNumber;
        AccountType = accountType;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }
}
