package interfaceeee;

public class SBI implements ReserveBank,WorldBank{

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
	@Override
	public void currancyExchangeRate() {
		// TODO Auto-generated method stub
		System.out.println("SBi charges currancy exchange rate of 0.1 %");
		
	}
	
	@Override
	public void fixedDepositeScheme() {
		// TODO Auto-generated method stub
		System.out.println("SBI fixed deposite inerest rate = 5%");
		
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
		rSBI.defaultMethodFromInterface();
		
		ReserveBank.educationalLoanInterestRate();	
		
		
		SBI sbi = new SBI();
		sbi.carLoanInterestRate();
		sbi.homeLoanInterestRate();
		sbi.goldLoanInterestRate();
		System.out.println(sbi.ABC);
		System.out.println(sbi.PQRS);
		sbi.defaultMethodFromInterface();
		
		
		
	}

	

	

}
