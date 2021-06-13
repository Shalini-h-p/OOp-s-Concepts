package Shalini.com;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public Account() {
        this("12345", 89.00, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor is called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameter called ");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999", 78.89, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println(" Deposit of= " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawalAmount(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println(" only " + this.balance + " available, withdrawal Amount is not processed ");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println(" withdrawal of " + withdrawalAmount + " is processed. Remaining balance= " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
