package Shalini.com;

public class Main {

    public static void main(String args[]) {
        Account shaluAccount = new Account();  //("2345",56.90,"Anjali","anju@gmail.com","(087) 234-8765");
        System.out.println(shaluAccount.getNumber());
        System.out.println(shaluAccount.getBalance());
        System.out.println(shaluAccount.getCustomerName());
        shaluAccount.withdrawalAmount(100.0);

        shaluAccount.deposit(90.2);
        shaluAccount.withdrawalAmount(40.0);

        shaluAccount.deposit(30.0);
        shaluAccount.withdrawalAmount(20.0);

        Account rajAccount = new Account("Raj", "raj@gamil.com", "1234");
        System.out.println(rajAccount.getNumber() + " name " + rajAccount.getCustomerName());
        System.out.println(" Account Balance is=" + rajAccount.getBalance());
        rajAccount.withdrawalAmount(78.89);
    }
}
