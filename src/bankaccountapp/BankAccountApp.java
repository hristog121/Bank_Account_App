package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Hristo Georgiev", "321345435", 1500);

        Savings saveacc1 = new Savings("Lin Lin", "938476123", 2500);

        saveacc1.showInfo();

        System.out.println("******************************");

        chkacc1.showInfo();

        // Read a CSV File then create a new accounts based on that data
    }
}
