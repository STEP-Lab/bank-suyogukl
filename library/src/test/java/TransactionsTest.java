import com.step.bank.CreditTransaction;
import com.step.bank.DebitTransaction;
import com.step.bank.Transactions;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;


public class TransactionsTest {

    @Test
    public void ShouldContainCreditTransaction() {
        Transactions transactions = new Transactions();
        transactions.credit("suyog", 2000);
        assertThat(transactions.getList(), hasItem(new CreditTransaction("suyog", 2000)));
    }

    @Test
    public void ShouldContainDebitTransaction() {
        Transactions transactions = new Transactions();
        transactions.debit("suyog",2000);
        assertThat(transactions.getList(),hasItem(new DebitTransaction("suyog",2000)));
    }
}
