package _Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WomenPage {

@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Tops')])[2]")
    public static WebElement Tops;

@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Dresses')])[9]")
    public static WebElement Dresses;

@FindBy(how = How.CSS, using = "a.img > img.replace-2x")
    public static WebElement TOPS;

@FindBy(how = How.XPATH, using = "//li[2]/div/a/img")
    public static WebElement DRESSES;

    public void Topsbutton() {Tops.click();}

    public void Dressesbutton() {Dresses.click();}

    public void TOPS_Link() {TOPS.click();}

    public void DRESSES_link() {DRESSES.click();}


}

