package BankManagementSystem;

import java.util.Scanner;

public class Menue
{

    public Menue(Scanner input, Acc acc)
    {
        int j=0;
        do {
            System.out.println("\nWelcome ");
            System.out.println("1- Deposit \n2- Withdraw \n3- Balance \n4- ShowInfo \n5-Exit");// Options
            j = input.nextInt();// store the user input in j var
            switch (j){
                case 1 :
                    new Deposit(input,acc); // creating a new Obj from class Deposit, which have a constructor that implement deposit method
                    break;
                case 2 :
                    new Withdraw(input,acc);// creating a new Obj from class withdraw, which have a constructor that implement withdraw method
                    break;
                case 3 :
                    System.out.println("Your Balance is :" + acc.getBalance());
                    break;
                case 4 :
                    System.out.println("Name : " + acc.getFirstName() + " " + acc.getLastName()+
                            "\nID : " + acc.getAccID()+
                            "\nBalance : " + acc.getBalance());
                    break;

            }
        }while (j != 5);

    }





}
