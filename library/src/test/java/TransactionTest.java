import com.step.bank.Transaction;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class TransactionTest {
    private Transaction transaction;

    @Before
    public void setUp() {
        Date date = new Date();
        transaction = new Transaction(date,"Suyog",2000);
    }

    @Test
    public void ShouldAddTransaction() {
        assertThat(transaction.getDate(),is(new Date()));
    }
}
