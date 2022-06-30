package com.training;

public class SavingAccount extends  BankAccount {

    private String aadharNumber;
    private String nominee;

    public SavingAccount() {
        super();
    }

    public SavingAccount(long accountNumber, String accountHolderName, double balance, String aadharNumber, String nominee) {
        super(accountNumber, accountHolderName, balance);
       // super();
        this.aadharNumber = aadharNumber;
        this.nominee = nominee;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "aadharNumber='" + aadharNumber + '\'' +
                ", nominee='" + nominee + '\'' +
                '}'+super.toString();
    }
}
