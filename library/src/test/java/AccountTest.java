import com.step.bank.*;
import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertEquals;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() throws MinimumBalanceException, InvalidAccountNumberException {
        account=new Account("1234-1234",2000);
    }

    @Test
    public void checkAccountBalance() {
        assertThat(account.getAccountBalance(),is(2000.0));
    }
    @Test(expected = MinimumBalanceException.class)
    public void checkMinimumBalance() throws MinimumBalanceException, InvalidAccountNumberException {
        new Account("1234-1234",100);
    }

    @Test
    public void CheckWithdrawal() throws InsufficientBalanceException {
        assertEquals(account.withdraw(800),1200,0);
    }

    @Test(expected = InsufficientBalanceException.class)
    public void CheckInsufficientBalanceException() throws InsufficientBalanceException {
        account.withdraw(2000);
    }

    @Test
    public void ShouldCreditToAccount() throws InvalidCreditAmountException {
        double balance = account.credit(1000);
        assertEquals(balance,3000,0);
    }

    @Test(expected = InvalidCreditAmountException.class)
    public void ShouldGiveInvalidCreditAmountException() throws InvalidCreditAmountException {
        account.credit(-200.0);
    }

    @Test
    public void ShouldGiveInvalidDebitAmountException() throws InsufficientBalanceException {
        account.withdraw(-200.0);
    }
}
