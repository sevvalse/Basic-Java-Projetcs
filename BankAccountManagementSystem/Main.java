package BankAccountManagementSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(12345, "Ahmet", 500);
        BankAccount ba2 = new BankAccount(6789, "Mehmet", 1500);
        BankAccount ba3 = new BankAccount(9876, "Selin", 1000);

        try {
            ba1.deposit(200);
        }
        catch (NegativeAmountException e) {
            System.out.println("Negative Amount Exception");
        }

        try {
            ba2.withdraw(200);
        }
        catch (InsufficientFundException e) {
            System.out.println("Insufficient Funds Exception");
        }

        try {
            ba3.transfer(ba1, 500);
        }
        catch (InsufficientFundException e) {
            System.out.println("Insufficient Funds Exception");
        }
        catch (NegativeAmountException e) {
            System.out.println("Negative Amount Exception");
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }

        System.out.println(ba1);
        System.out.println(ba2);
        System.out.println(ba3);
    }
}
