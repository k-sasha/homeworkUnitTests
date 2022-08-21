package bankAccount.accounts;

public abstract class Account {
    private int balance;
    private int accountNumber;

    public Account(int balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

    @Override
    public String toString() {
        return "Account number: " + getAccountNumber() + ". Your balance is " + getBalance();
    }
}
