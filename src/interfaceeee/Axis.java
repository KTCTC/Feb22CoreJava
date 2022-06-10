package interfaceeee;

public class Axis implements ReserveBank{

	@Override
	public void homeLoanInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("home Loan Interest Rate of Axis = 6.55%");
		
	}

	@Override
	public void carLoanInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("car Loan Interest Rate of Axis = 9.5%");
		
	}
	@Override
	public void fixedDepositeScheme() {
		// TODO Auto-generated method stub
		System.out.println("Axis fixed deposite inerest rate = 5.5%");
		
	}
	@Override
	public void currancyExchangeRate() {
		// TODO Auto-generated method stub
		System.out.println("Axis charges currancy exchange rate of 0.12 %");
		
	}
	public void personalLoanInterestRate()
	{
		System.out.println("personal Loan Interest Rate of Axis = 10%");
	}
	
	public static void main(String[] args) {
		
		ReserveBank rAxis = new Axis();
		rAxis.carLoanInterestRate();
		System.out.println(rAxis.ABC);
		System.out.println(rAxis.PQRS);
		System.out.println(ReserveBank.PQRS);
		
		
		Axis axis = new Axis();
		axis.carLoanInterestRate();
		axis.homeLoanInterestRate();
		axis.personalLoanInterestRate();
		System.out.println(axis.ABC);
		System.out.println(axis.PQRS);
		
		
	}

}
