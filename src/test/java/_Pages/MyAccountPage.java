package _Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {

    //NB: I will be abbreviating the names within the link buttons on my Account Page

    @FindBy(how = How.LINK_TEXT, using = "actual_name")
        public static WebElement MyAccName;

    @FindBy(how = How.CSS, using = "a[title=\"Orders\"] > span")
        public static WebElement OHAD;

    @FindBy(how = How.CSS, using = "a[title=\\\"Credit slips\\\"] > span")
        public static WebElement MYCS;

    @FindBy(how = How.CSS, using = "a[title=\\\"Addresses\\\"] > span")
        public static WebElement MYADD;

    @FindBy(how = How.XPATH, using = "//li[4]/a/span")
        public static WebElement MYPI;

    @FindBy(how = How.XPATH, using = "//div[2]/ul/li/a/span")
        public static WebElement MYWL;

    @FindBy(how = How.LINK_TEXT, using = "Sign out")
        public static WebElement signOut;

    public void verify_actualname(){MyAccName.isDisplayed();}

    public void click_OHAD_linkButton(){OHAD.click();}

    public void click_MYCS_linkButton(){MYCS.click();}

    public void click_MYADD_linkButton(){MYADD.click();}

    public void click_MYPI_linkButton(){MYPI.click();}

    public void click_MYWL_linkButton(){MYWL.click();}

    public void click_signout(){signOut.click();}
}