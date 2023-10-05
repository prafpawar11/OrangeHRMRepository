package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;

public class PIMPageTest extends BaseClass {

	PIMPage pim;
	String id;

	@Test(priority = 1)
	public void validateUserOnPIMPage() throws InterruptedException {
		pim = new PIMPage();
		Thread.sleep(5000);
		String actualTitle = pim.clickonPimLinkAndCaptureTitle();
		Assert.assertTrue(actualTitle.contains("pim"));
	}

	@Test(priority = 2)
	public void validateCreatedEmployeeFunctionality() {

		id = pim.createEmployee("Ashwini", "abc", "Nikam");

		System.out.println(id);
	}

}
