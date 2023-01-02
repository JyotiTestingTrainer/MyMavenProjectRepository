package functionalTest;

import org.testng.annotations.Test;

public class Payment {
	@Test
	public void verifyUPI()
	{
		System.out.println("Check UPI Payment......");
	}
	@Test
	public void verifyCreditCard()
	{
		System.out.println("Check CC Payment......");
	}

	@Test
	public void verifyDebitCard()
	{
		System.out.println("Check DC Payment......");
	}

	@Test
	public void verifyNetBanking()
	{
		System.out.println("Check NetBanking Payment......");
	}




}
