package bankAccount.accounts;

public class SavingsAccount extends Account {
    public SavingsAccount(int balance, int accountNumber) {
        super(Math.max(balance, 0), accountNumber);
    }

    @Override
    public void pay(int amount) {
        System.out.println("payment is not available");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (getBalance() < amount) {
            System.out.println("Money transfer failed");
            return;
        }
        account.addMoney(amount);
        setBalance(getBalance() - amount);
        System.out.println("Transferred money to account " + account.getAccountNumber());
        System.out.println(this);
    }

    @Override
    public void addMoney(int amount) {
        setBalance(getBalance() + amount);
        System.out.println("Put money into account");
        System.out.println(this);
    }
}
