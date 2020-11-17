package com.flow.gameFlow;

import Helper.testBase;
import _Pages.MyAccountPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Accounts extends testBase {
    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Then("^I verify that the account name \"([^\"]*)\" is displayed$")
    public void i_verify_that_the_account_name_is_displayed(String actual_name) throws Throwable {
//		String ExpectedName = driver.findElement(By.cssSelector("span")).getText();
//		System.out.println(ExpectedName);
//		Assert.assertEquals(ExpectedName, actual_name);
        MyAccountPage myaccountpage = PageFactory.initElements(driver,MyAccountPage.class);
        myaccountpage.verify_actualname();
    }

    @Then("^I sign out user$")
    public void i_sign_out_user() throws Throwable {
//		driver.findElement(By.linkText("Sign out")).click();
//		Thread.sleep(2000);
        MyAccountPage myaccountpage = PageFactory.initElements(driver,MyAccountPage.class);
        myaccountpage.click_signout();
    }

}
