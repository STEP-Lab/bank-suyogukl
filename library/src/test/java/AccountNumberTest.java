import com.step.bank.*;
import com.step.bank.InvalidAccountNumberException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class AccountNumberTest {

    private AccountNumber accountNumber;

    @Before
    public void setUp() throws Exception, InvalidAccountNumberException {
        accountNumber=new AccountNumber("1234-1234");
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void ValidateAccountNumber() throws InvalidAccountNumberException {
        new AccountNumber("1234-123");
    }
    @Test
    public void getAccountNumber() {
        assertThat(accountNumber.getAccountNumber(),is("1234-1234"));
        assertThat(accountNumber.getAccountNumber(),not("1234-3124"));
    }
}
