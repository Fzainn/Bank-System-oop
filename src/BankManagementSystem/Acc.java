package BankManagementSystem;

public class Acc
{
    private String firstName ;
    private String lastName ;
    private int AccID;
    private double balance;
    private int password;

    public Acc()
    {
        /*
        non-para constructor to provide default values for an Obj till values are changing
        As every time we create class, java automatically provides a hidden empty constructor
        if you do not define any constructor yourself
        this default constructor allows yous to create Obj of a class without any initial data
        if you define any kinda of constructor, the default one is no longer provided automatically.
        */
    }

    public Acc(String firstName, String lastName, int accID, double balance, int password) { // for receiving inputs from the user
        this.firstName = firstName;
        this.lastName = lastName;
        this.AccID = accID;
        this.balance = balance;
        this.password = password;
    }

    public String getFirstName() { // getter and setter for get and set the inputs
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAccID() {

        return AccID;
    }

    public void setAccID(int accID) {

        AccID = accID;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public int getPassword() {

        return password;
    }


}
