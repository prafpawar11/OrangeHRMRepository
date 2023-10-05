package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimLink;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addEmployeebtn;

	@FindBy(name = "firstName")
	private WebElement fname;

	@FindBy(name = "middleName")
	private WebElement mname;

	@FindBy(name = "lastName")
	private WebElement lname;

	@FindBy(xpath = "//input[@name='lastName']/following::input[1]")
	private WebElement empId;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public String clickonPimLinkAndCaptureTitle() {
		pimLink.click();
		return driver.getCurrentUrl();
	}

	public String createEmployee(String FName, String MName, String LName) {
		addEmployeebtn.click();
		fname.sendKeys(FName);
		mname.sendKeys(MName);
		lname.sendKeys(LName);
		String id = empId.getText();
		saveButton.click();

		return id;
	}

}
