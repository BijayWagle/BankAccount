package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account>accounts=new LinkedList<Account>();
		String file ="C:\\Users\\BijayaWagle\\OneDrive-Xpanxion\\Desktop\\java training\\Read\\NewBankAccounts.csv";
		/*
		Checking chkacc1=new Checking("Tom Wilson","32455123",1500);
		Savings savacc1=new Savings("Bijay Wagle","12345678",3000);
		
		savacc1.compound();
		savacc1.showInfo();
		System.out.println("*****************");
		chkacc1.showInfo();
		*/
		
// read a csv file then create new accounts based on that data
		List<String[]>newAccountHolders=utilities.CSV.read(file);
		for(String[] accountHolder:newAccountHolders) {
			System.out.println("NEW ACCOUNT");
			String name=accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit= Double.parseDouble(accountHolder[3]);
			//System.out.println(name+" "+ sSN+" "+accountType+" "+"$"+initDeposit);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN,initDeposit));
			}
			else if(accountType.equals("Checking")){
				accounts.add(new Checking(name, sSN,initDeposit));
			}
			else {
				System.out.println("ERROR READING THE ACCOUNT");
			}
		}
				for(Account acc:accounts) {
			System.out.println("\n******************");
		acc.showInfo();	
		}
	}

}
