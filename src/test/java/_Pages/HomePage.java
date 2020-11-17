package _Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how= How.LINK_TEXT, using="Sign in")
    public static WebElement signIn;

    @FindBy(how= How.LINK_TEXT, using="Contact us")
    public static WebElement contactUs;

    public void click_signin(){
        signIn.click();
    }

    public void click_contactUS(){
        contactUs.click();
    }
}
