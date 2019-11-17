package bankaccountapp;

public class Checking extends Account {
    // List the props specific to the checking account
    int debitCardNumber;
    int debitCardPIN;
    // Constructor to init checking account props

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN,initDeposit);
        accountNumber = "2" + accountNumber;

    }


    // List any methods specific to the checking account

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");
    }
}
