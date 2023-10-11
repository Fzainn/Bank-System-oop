package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;
import BankManagementSystem.Acc;

public class main
{

    static Scanner input;//define Obj from Scanner for inputs (static means this variable is associated with the class itself as this var is shared among all Obj)
    static int lastid = 0; // for making users IDS
    private static ArrayList<Acc> accounts ;



    public static void main(String[] args) {


        input = new Scanner(System.in);
        accounts = new ArrayList<>();

        System.out.println("Welcome to Our Bank Management System!");
        System.out.println("1-SignUp:");
        System.out.println("2-LogIn");
        int i = input.nextInt();
        switch (i){
            case 1 : new createAccount(input, lastid,accounts); // create a new Obj from createAccount class which have a constructor that implement signup method
                break;

            case 2 : new Login(input,accounts);// create a new Obj from login class which have a constructor that implement login method
                break;

        }

    }














}
