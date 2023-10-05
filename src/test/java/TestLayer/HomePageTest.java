package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(priority = 1)
	public void validateHomePageTitle() {
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test(priority = 2)
	public void validateHomePageUrl() {
		String actualurl = driver.getCurrentUrl();

		Assert.assertTrue(actualurl.contains("hrm"));
	}

}
