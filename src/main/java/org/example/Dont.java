package org.example;

public class Dont {
    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("12345", 1000.00, "Bob Brown", "myemaill@bob.com","8161247818");
        BankAccount myAccount = new BankAccount();

        myAccount.displayAccountDetails();
        // Depositing funds
        myAccount.deposit(100000.0);

        // Withdrawing funds
        myAccount.withdrawal(6000.0);

        // Attempting to withdraw more than available balance
        myAccount.withdrawal(500);

        // Displaying final account details
        myAccount.displayAccountDetails();

    }
}
