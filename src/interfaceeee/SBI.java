package interfaceeee;

public class SBI implements ReserveBank{

	@Override
	public void homeLoanInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("home Loan Interest Rate of SBI = 8.05%");
		
	}

	@Override
	public void carLoanInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("car Loan Interest Rate of SBI = 9%");
		
	}
	
	public void goldLoanInterestRate()
	{
		System.out.println("gold Loan Interest Rate of SBI = 10%");
	}
	
	public static void main(String[] args) {
		
		ReserveBank rSBI = new SBI();
		rSBI.carLoanInterestRate();
		rSBI.carLoanInterestRate();
		System.out.println(rSBI.ABC);
		System.out.println(rSBI.PQRS);
		System.out.println(ReserveBank.PQRS);
		
		
		SBI sbi = new SBI();
		sbi.carLoanInterestRate();
		sbi.homeLoanInterestRate();
		sbi.goldLoanInterestRate();
		System.out.println(sbi.ABC);
		System.out.println(sbi.PQRS);
		
		
	}

}
