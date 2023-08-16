package practicegroup;

import org.testng.annotations.Test;

public class DeleteIndividual {
	
	@Test(groups = "smoke")
	public void deleteIndividual()
	{
		System.out.println("....>delete individual");
	}
	
	@Test(groups = "regression")
	
	public void deleteAppartment()
	{
		System.out.println("....delete appartment");
	}

}
