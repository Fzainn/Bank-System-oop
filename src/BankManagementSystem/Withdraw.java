package BankManagementSystem;

import java.util.Scanner;

public class Withdraw
{
    public Withdraw(Scanner input, Acc acc)
    {
        System.out.println("Enter the amount :");
        double amount = input.nextDouble();
        acc.setBalance(acc.getBalance() - amount);
        System.out.println("Withdraw Operation done successfully!");

    }
}
