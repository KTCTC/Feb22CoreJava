package interfaceeee;

public interface ReserveBank extends IndianGov{
	
	public static final int ABC = 56;
	 int PQRS = 77;
	
	public abstract void homeLoanInterestRate();	
	public abstract void carLoanInterestRate();
	public abstract void currancyExchangeRate();
	
	public static void educationalLoanInterestRate()
	{
		System.out.println("Educational interest rate is 7%");
	}
	
	public default void defaultMethodFromInterface()
	{
		System.out.println("default Method From Interface");
	}
	
}
