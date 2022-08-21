package bankAccount.accounts;

public class CreditAccount extends Account {

    public CreditAccount(int balance, int accountNumber) {
        super(Math.min(balance, 0), accountNumber);
    }

    @Override
    public void pay(int amount) {
        System.out.println("payment made");
        setBalance(getBalance() - amount);
        System.out.println(this);
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Money transfer is not available");
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Put money into account");
        setBalance(Math.min(getBalance() + amount, 0));
        System.out.println(this);
    }
}
