package _Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {

@FindBy(how = How.CSS, using = "#block_top_menu > ul > li:nth-child(1) > a")
    public static WebElement WOMEN;

@FindBy(how = How.CSS, using = "#block_top_menu > ul > li:nth-child(2) > a")
    public static WebElement DRESSES;

@FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public static WebElement T_SHIRTS;

@FindBy(how = How.CSS, using = "#contact-link > a")
    public static WebElement Contact_us;

@FindBy(how = How.ID, using = "search_query_top")
    public static WebElement Search;

public void click_women_link(){WOMEN.click();}

public void click_dresses_link(){DRESSES.click();}

public void click_Tshirts_link(){T_SHIRTS.click();}

public void click_Contact_us_link(){Contact_us.click();}

//Remember to create place holders "Item" when writing search scenario

public void searchItem(String item){
    Search.click();
    Search.sendKeys(item);

}



}
