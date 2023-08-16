package practicegroup;

import org.testng.annotations.Test;

public class CreateIndividual {
	
	@Test(groups ="smoke")
	public void createInd()
	{
		System.out.println("....>create individual");
	}
	
	@Test(groups="regression")
	
	public void createAppartment()
	{
		System.out.println("....create appartment");
	}
}

