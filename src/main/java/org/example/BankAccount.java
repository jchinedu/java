package org.example;

public class BankAccount {
    private String AccountNumber;
    private double AccountBalance;
    private String CustomerName;
    private String Email;
    private String PhoneNumber;

    public BankAccount() {
        this("56789", 2.50, "default name", "Defaut address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String AccountNumber, double AccountBalance, String CustomerName, String Email, String PhoneNumber) {
        System.out.println("Account constructor with parameter called");

        this.AccountNumber = AccountNumber;
        this.AccountBalance = AccountBalance;
        this.CustomerName = CustomerName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }



    public double getAccountBalance() {
        return AccountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }



    public void setAccountNumber(String accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.AccountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            AccountBalance += amount;

        System.out.println("successfully deposited $ " + amount);
        System.out.println("new balance: $" + AccountBalance);
    } else {
            System.out.println("deposit amount must be greater than zero.");
        }


    }
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= AccountBalance) {
            AccountBalance -= amount;
                    System.out.println("successfully withdrew $ " + amount);
                    System.out.println("new balance: $" + AccountBalance);
        }else if (amount > AccountBalance) {
            System.out.println("insufficient funds. Available balance; $" + AccountBalance);
        }else {
            System.out.println("withdrawal must be greater than zero");
        }



    }
    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Email: " + Email);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Account Balance: $" + AccountBalance);
    }
}
