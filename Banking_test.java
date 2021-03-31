
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Banking_test {

    private Banking abc;

	@Before
	public void setUp() throws Exception {
		abc = new Banking((float)(20000));
	}

	@Test
	@FileParameters("src/BankingTestInput.csv")
	public void test(int testcaseNumber, float withdrawlAmount, float deposit, boolean withdrawable) {
		float oldBalance = abc.getBalance();	
		int oldCreditScore = abc.getCreditscore();
		
		if (deposit>0){
			assertTrue(abc.makeDeposit(deposit));
			assertNotEquals(abc.getBalance(), oldBalance);
			assertNotEquals(abc.getCreditscore(), oldCreditScore);
		}
		else {
			assertFalse(abc.makeDeposit(deposit));
			assertEquals(abc.getBalance(), oldBalance, 0.0001);
			assertEquals(abc.getCreditscore(), oldCreditScore);
		}
		assertEquals(withdrawable,abc.getWithdrawl(withdrawlAmount));
	}

}