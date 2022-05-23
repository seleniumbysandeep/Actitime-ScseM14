package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
@Test
public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	FileLib f=new FileLib();
	String customername = f.getExcelData("CreateCustomer",1,2);
	String custDescr = f.getExcelData("CreateCustomer",1,3);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getCustomerTbx().sendKeys(customername);
	t.getDescriptionTbx().sendKeys(custDescr);
	t.getSelectCustomerDropDown().click();
	t.getOurCompanyOption().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(4000);
	String ActualCutomercreate = t.getCustomercreatedtext().getText();
Assert.assertEquals(ActualCutomercreate, customername);
}
}
