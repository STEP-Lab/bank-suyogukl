import com.step.bank.AccountNumber;
import com.step.bank.InvalidAccountNumberException;
import org.junit.Test;

public class AccountNumberTest {

    @Test(expected = InvalidAccountNumberException.class)
    public void ShouldGiveExceptionForLessCharacter() throws InvalidAccountNumberException {
        new AccountNumber("1234-12");
    }

    @Test(expected =    InvalidAccountNumberException.class)
    public void ShouldGiveExceptionForAlphaNumCharacter() throws InvalidAccountNumberException {
        new AccountNumber(("123a-123d"));
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void ShouldGiveExceptionForCharacterWithoutHyphen() throws InvalidAccountNumberException {
        new AccountNumber("12341234");
    }
}
