package BankAccountManagementSystem;

public class BankAccount {

    int accountID;
    String holderName;
    double balance;

    public BankAccount(int accountID, String holderName, double balance) {
        this.accountID = accountID;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) throws NegativeAmountException{
        if (!(amount > 0)) {
            throw new NegativeAmountException("Negative amount");
        }
        balance += amount;
    }

    void withdraw(double amount) throws InsufficientFundException, NegativeAmountException{
        if (balance < amount) {
            throw new InsufficientFundException("Insufficient fund");
        }
        balance -= amount;
    }
    void transfer(BankAccount target, double amount) throws InsufficientFundException,
            NegativeAmountException, NullPointerException{
        if (!(amount > 0)) {
            throw new NegativeAmountException("Negative amount Exception");
        }
        if (balance < amount) {
            throw new InsufficientFundException("Insufficient fund Exception");
        }
        if (target == null) throw new NullPointerException("Null Pointer Exception");
        withdraw(amount);
        target.deposit(amount);
        target.balance += amount;
        this.balance -= amount;
    }

    public String toString(){
        return accountID + " " + holderName + " " + balance;
    }
}
