import bankAccount.accounts.Account;
import bankAccount.accounts.CheckingAccount;
import bankAccount.accounts.SavingsAccount;
import org.junit.jupiter.api.*;

public class CheckingAccountTest {
    private static long suiteStartTime;
    private long testStartTime;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running Tests");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("Tests complete: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete: " + (System.nanoTime() - testStartTime));
    }

    @Test
    public void testPay() {
        //given
        Account checkingAccount = new CheckingAccount(25_000, 90190);
        int excepted = 15000;

        //when
        checkingAccount.pay(10_000);
        int actual = checkingAccount.getBalance();

        //then
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void testTransfer() {
        //given
        Account checkingAccount = new CheckingAccount(25_000, 90190);
        Account savingsAccount = new SavingsAccount(10_000, 56567);
        int exceptedCheckingAccount = 20000;
        int exceptedSavingsAccount = 15000;

        //when
        checkingAccount.transfer(savingsAccount, 5_000);
        int actualCheckingAccount = checkingAccount.getBalance();
        int actualSavingsAccount = savingsAccount.getBalance();

        //then
        Assertions.assertEquals(exceptedCheckingAccount, actualCheckingAccount);
        Assertions.assertEquals(exceptedSavingsAccount, actualSavingsAccount);
        Assertions.assertEquals(CheckingAccount.class, checkingAccount.getClass());
    }


    @Test
    public void testAddMoney(){
        //given
        Account checkingAccount = new CheckingAccount(25, 90190);
        int excepted = 35;

        //act
        checkingAccount.addMoney(10);
        int actual = checkingAccount.getBalance();

        //assert
        Assertions.assertEquals(excepted, actual);
    }



}
