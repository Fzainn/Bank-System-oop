package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Login
{
    public Login(Scanner input,  ArrayList<Acc> accounts)
    {
        System.out.println("Enter your ID :");
        int id = input.nextInt();
        System.out.println("Enter your password :");
        int password = input.nextInt();
        Acc account = new Acc(); // this var to store a reference of the acc if matching acc is found
        boolean exist = false; // this set false, assuming the Acc is not found, if it founds, this value will change to true
        for (Acc acc : accounts ){ // this is for-each loop, iterate through the collection of Obj in the arraylist(accounts)
            // acc is a temporary var that represents each element (Obj) in the arraylist (bo not forget that: Acc acc is an Obj from type Acc class)
            if (acc.getAccID()== id && acc.getPassword()==password){ // if id and password provided from the user are equals to stored ones
                exist = true; // so user acc the value of boolean will change to exists = true
                account = acc;
            }

        }
        if (exist){// checks the value of exit var
            new Menue(input, account); // creating new Obj from class Menue, which is have constructor that shows menue

        }else{
            System.out.println("Account does not exist!");
        }

    }


}
