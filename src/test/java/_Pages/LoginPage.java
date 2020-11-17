package _Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID, using = "email")
    public static WebElement userEmail;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement userPassword;

    @FindBy(how = How.CSS, using = "#SubmitLogin > span")
    public static WebElement login_button;

    @FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
public static WebElement ForgotPasswdLink;

    public void type_email_address(String email) {
        userEmail.sendKeys(email); }

    public void type_password(String password) {
        userPassword.sendKeys(password);
    }

    public void click_Login_Button() {
        login_button.click();
    }

    public void click_4gotPasswdLink(){
        ForgotPasswdLink.click();
    }
 }
