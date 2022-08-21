import bankAccount.accounts.Account;
import bankAccount.accounts.CheckingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class AccountTest {

    @ParameterizedTest
    @MethodSource("source")
    public void testGetBalance1(Account checkingAccount,int excepted) {

        //act
        int result = checkingAccount.getBalance();

        //assert
        Assertions.assertEquals(excepted, result);
    }

    private static Stream<Arguments> source(){
        return Stream.of(Arguments.of( new CheckingAccount(25, 90190), 25),
                Arguments.of( new CheckingAccount(40, 90190),40));
    }

    @Test
    public void testGetBalance2() {
        //given
        Account checkingAccount = new CheckingAccount(25, 90190);
        int excepted = 25;

        //act
        int result = checkingAccount.getBalance();

        //assert
        Assertions.assertEquals(excepted, result);
    }
}
