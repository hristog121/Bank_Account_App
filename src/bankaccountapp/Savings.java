package bankaccountapp;

public class Savings extends Account {
    // List props specific for the savings account
    int saftyDepositBoxID;
    int saftyDepositBoxKey;
    // Constructor to init settings for the Saving props

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN,initDeposit);
        accountNumber = "1" + accountNumber;
    }

    // List methods specific for the saving accounts

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");

    }
}
