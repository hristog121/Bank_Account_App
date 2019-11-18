package bankaccountapp;

public class Checking extends Account {
    // List the props specific to the checking account
    int debitCardNumber;
    int debitCardPIN;
    // Constructor to init checking account props

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN,initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }


    // List any methods specific to the checking account
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10,4));

    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Debit Account Features" +
                        "\n Debit Card Number: " + debitCardNumber +
                        "\n Debit Card PIN: " + debitCardPIN

        );
    }
}
