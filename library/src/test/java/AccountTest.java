import com.step.bank.Account;
import com.step.bank.InvalidAccountNumberException;
import com.step.bank.MinimumBalanceException;
import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() throws MinimumBalanceException, InvalidAccountNumberException {
        account=new Account("1234-1234",1000);
    }
    @Test
    public void getAccountNumber() {
        assertThat(account.getAccountNumber(),is("1234-1234"));
        assertThat(account.getAccountNumber(),not("1234-3124"));
    }

    @Test
    public void checkAccountBalance() {
        assertThat(account.getAccountBalance(),is(1000));
    }
    @Test(expected = MinimumBalanceException.class)
    public void checkMinimumBalance() throws MinimumBalanceException, InvalidAccountNumberException {
        new Account("1234-1234",100);
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void ValidateAccountNumber() throws InvalidAccountNumberException, MinimumBalanceException {
        new Account("1234-123",1000);
    }


}
