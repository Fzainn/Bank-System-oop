package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class createAccount
{
    public createAccount(Scanner input, int lastid, ArrayList<Acc> accounts)
    {
        System.out.println("Enter Your first Name :");
        String firstName = input.next();
        System.out.println("Enter Your last Name :");
        String lastName = input.next();
        System.out.println("Enter Your Balance :");
        double balance = input.nextDouble();
        System.out.println("Enter You Password (Digits only!) :");
        int Password = input.nextInt();
        System.out.println("Confirm Password :");
        int password2 = input.nextInt();
        if (Password != password2){
            System.out.println("not matching!, Try again");
            return;
        }
        int id = 100 + lastid; // initialize id for all users = 100, its static for all
        lastid = lastid + 1; // it will change with the no.of the user will signup
        Acc acc = new Acc();// creating a new Obj from the Acc class
        System.out.println("your Account Id is : " + id);
        new Menue(input,acc);//// creating a new Obj from class Menue, which have a constructor that shows th menue
    }


}
