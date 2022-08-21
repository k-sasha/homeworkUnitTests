package bankAccount;

import bankAccount.accounts.Account;
import bankAccount.accounts.CheckingAccount;
import bankAccount.accounts.CreditAccount;
import bankAccount.accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(10_000, 56567);
        Account creditAccount = new CreditAccount(-5_000, 11155);
        Account checkingAccount = new CheckingAccount(25_000, 90190);

        savingsAccount.transfer(creditAccount, 25_000);
        savingsAccount.addMoney(10_000);
        savingsAccount.pay(3_000);

        System.out.println();

        creditAccount.transfer(savingsAccount, 2_000);
        creditAccount.addMoney(30_000);
        creditAccount.pay(40_000);

        System.out.println();

        checkingAccount.transfer(savingsAccount, 5_000);
        checkingAccount.addMoney(10_000);
        checkingAccount.pay(10_000);


    }
}
