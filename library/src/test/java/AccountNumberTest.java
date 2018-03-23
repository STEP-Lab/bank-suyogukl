import com.step.bank.AccountNumber;
import com.step.bank.InvalidAccountNumberException;
import org.junit.Test;

public class AccountNumberTest {

    @Test(expected = InvalidAccountNumberException.class)
    public void ValidateAccountNumber() throws InvalidAccountNumberException {
        new AccountNumber("1234-123");
    }

}
