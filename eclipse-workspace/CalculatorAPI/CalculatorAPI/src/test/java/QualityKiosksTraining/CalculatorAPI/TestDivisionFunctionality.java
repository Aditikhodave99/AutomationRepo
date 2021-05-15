package QualityKiosksTraining.CalculatorAPI;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
public class TestDivisionFunctionality 
{

	Calculator Cal;
	int Res;
	@BeforeClass
	public void CreateObj()
	{
		System.out.println("I am in Before class");
		Cal=new Calculator();
	}
	
	@BeforeGroups
	public void InitGroup()
	{
		System.out.println("Im in Before Group");
		Calculator Obj = new Calculator();
	}
	@BeforeMethod
	public void InitialiseRes()
	{
		System.out.println("I am in Before Method");
		Res=0;
	}
	
	@Test(priority=1,groups= {"RegressionTest"})
	public void TestDivisionWithPositiveValues()
	{
		System.out.println("I am in Test case 1 of Division functionality");
		Res=Cal.Division(100, 2);
		Assert.assertEquals(Res, 50,"Division is not working with Positive values");
		
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("In After Method");
	}
	
	
	@Test(priority=2)
	public void TestDivisionWithNegativeValues()
	{
		System.out.println("I am in Test case 2 of Division functionality");
		Res=Cal.Division(-100, -2);
		Assert.assertEquals(Res, 50,"Division is not working with Positive values");
		
	}
	@AfterClass
	public void ReleaseObj()
	{
		System.out.println("I am in After class");
		Cal=null;
	}

}
