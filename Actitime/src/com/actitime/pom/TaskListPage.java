package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[.='Add New']")
private WebElement addNewBtn;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newCustomerOption;

@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
private WebElement customerTbx;

@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement descriptionTbx;

@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
private WebElement selectCustomerDropDown;

@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourCompanyOption;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustomerBtn;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement customercreatedtext;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewBtn() {
	return addNewBtn;
}

public WebElement getNewCustomerOption() {
	return newCustomerOption;
}

public WebElement getCustomerTbx() {
	return customerTbx;
}

public WebElement getDescriptionTbx() {
	return descriptionTbx;
}

public WebElement getSelectCustomerDropDown() {
	return selectCustomerDropDown;
}

public WebElement getOurCompanyOption() {
	return ourCompanyOption;
}

public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}

public WebElement getCustomercreatedtext() {
	return customercreatedtext;
}


}
