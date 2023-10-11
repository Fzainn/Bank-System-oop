package BankManagementSystem;

import java.util.Scanner;

public class Deposit
{
    public Deposit(Scanner input, Acc acc) // constructor takes 2 arguments, input Obj from Scanner class and acc Obj from class Acc
    {
        System.out.println("Enter the amount :");
        double amount = input.nextDouble(); // store the user input
        acc.setBalance(acc.getBalance() + amount); // modify the balance by adding the amount in it
        System.out.println("Deposit Operation done successfully!");

    }



}
