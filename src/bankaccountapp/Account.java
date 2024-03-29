package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;

    static int index = 10000;

    // Constructor to set base props and init the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;


        //Set account number
        index++;
        this.accountNumber = setAccountNumber();

    }

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;

    }

    // List of common methods
    public void showInfo(){
        System.out.println(
                "Name: " + name +
                        "\nAccount Number: " + accountNumber +
                        "\nBalance: " + balance
        );
    }
}
