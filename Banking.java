
public class Banking {
	float balance;
	int creditscore;
	
	public Banking(float balance) {
		this.balance = balance;
		this.creditscore = ((int)(balance/100)*2);
	}
	//boolean gndCollCaut, gndCollWarn, gndCollAlert,emerGD;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(int creditscore) {
		this.creditscore = creditscore;
	}
	public boolean makeDeposit(float depositAmount) {
		if(depositAmount>0) {
			setBalance(balance+depositAmount);
			setCreditscore(creditscore+((int)(depositAmount/100)*2));
			return true;
		}
		return false;
		
	}
	public boolean getWithdrawl(float withdrawlAmount) {
		System.out.println(balance);
		System.out.println(withdrawlAmount);
		if(withdrawlAmount>0) {
			if(balance >= withdrawlAmount) {
				setBalance(balance-withdrawlAmount);
				setCreditscore(creditscore-((int)(withdrawlAmount/100)*2));
				return true;
			}
			else {
				return false;
			}
		}
		return false;
		
}
}


