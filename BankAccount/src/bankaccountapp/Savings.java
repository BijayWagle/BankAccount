package bankaccountapp;

public class Savings extends Account {
	//list the properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	//constructor to initialize saving account properties
	public Savings (String name,String sSN,double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	@Override
		public void setRate() {
		rate=getBaseRate()-.25;
	}
	//list any methods specific to the checking account
	private void setSafetyDepositBox() {
		//used (int) front of math to get the int value otherwise need to change variable to double 
		safetyDepositBoxID=(int) (Math.random()*Math.pow(10,3));
		safetyDepositBoxKey=(int) (Math.random()*Math.pow(10,4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Saving Account Features"+"\n Safety Deposit Box ID:"+
		safetyDepositBoxID+"\n Safety Deposit Box Key:"+safetyDepositBoxKey);		
	}
		
}
