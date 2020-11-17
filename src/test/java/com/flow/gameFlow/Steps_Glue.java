package com.flow.gameFlow;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Helper.testBase;
import _Pages.HomePage;
import _Pages.LoginPage;
import _Pages.MyAccountPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_Glue extends testBase {
//	public WebDriver driver;
	@Before
	public void setup() throws IOException {
		initialize();
	}

	@Given("^user is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
		driver.get(CONFIG.getProperty("URL"));
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser\\chromedriver.exe");
//		driver = new ChromeDriver();
//
//		driver.navigate().to("http://carguruji.com/shop/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^I click on the sign in button$")
	public void i_click_on_the_sign_in_button() throws Throwable {
//		driver.findElement(By.linkText("Sign in")).click();
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.click_signin();
	}

	@Given("^I enter the email \"([^\"]*)\" address$")
	public void i_enter_the_email_address(String email) throws Throwable {
//		driver.findElement(By.id("email")).click();
//		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.id("email")).sendKeys(email);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.type_email_address(email);
	}

	@Given("^I enter the password \"([^\"]*)\"$")
	public void i_enter_the_password(String password) throws Throwable {
//		driver.findElement(By.name("passwd")).sendKeys(password);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.type_password(password);
	}

	@Given("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
//		driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.click_Login_Button();
	}


	@Then("^I close down the browser$")
	public void i_close_down_the_browser() throws Throwable {
		driver.manage().deleteAllCookies();
		driver.close();
	}


		@When("^I search for dress$")
		public void i_search_for_dress() throws Throwable {
			driver.findElement(By.name("submit_search")).click();
		}

		@When("^I select dress from the list$")
		public void i_select_dress_from_the_list() throws Throwable {
			driver.findElement(By.xpath("//img[contains(@src,'http://carguruji.com/shop/7-small_default/blouse.jpg')]")).click();
		}

		@When("^I chose quantity, size and color required$")
		public void i_chose_quantity_size_and_color_required() throws Throwable {
			driver.findElement(By.xpath("//p[@id='quantity_wanted_p']/a[2]/span/i")).click();
			driver.findElement(By.id("group_1")).click();
			new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
			driver.findElement(By.id("group_1")).click();
			driver.findElement(By.id("color_8")).click();
		}

		@When("^I add items to cart$")
		public void i_add_items_to_cart() throws Throwable {
			driver.findElement(By.xpath("//p[@id='add_to_cart']/button/span")).click();
		}

		@When("^I click proceed to checkout$")
		public void i_click_proceed_to_checkout() throws Throwable {
			driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")).click();
		}

		@When("^I viewed items summary and click proceed to checkout$")
		public void i_viewed_items_summary_and_click_proceed_to_checkout() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		}

		@When("^I viewed billing, shipping adresses and click proceed to checkout$")
		public void i_viewed_billing_shipping_adresses_and_click_proceed_to_checkout() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		}

		@When("^I checked box to accept terms of services and click proceed to checkout$")
		public void i_checked_box_to_accept_terms_of_services_and_click_proceed_to_checkout() throws Throwable {
			driver.findElement(By.id("cgv")).click();
			driver.findElement(By.xpath("//form[@id='form']/p/button/span")).click();
		}

		@When("^I chose Check as mode of payment$")
		public void i_chose_Check_as_mode_of_payment() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span")).click();
		}

		@When("^I click confirm order$")
		public void i_click_confirm_order() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		}

		@Then("^I verify order is complete and successful$")
		public void i_verify_order_is_complete_and_successful() throws Throwable {
			assertEquals("Your order on CarGuruji Shop is complete.", driver.findElement(By.xpath("//div[@id='center_column']/p")).getText());
		}

	@Then("^I click the Contact us button$")
	public void i_click_the_Contact_us_button() throws Throwable {
		driver.findElement(By.cssSelector("#contact-link > a")).click();
	}

	@Then("^I click in the Subject Heading tab to select Customer service from the drop down menu$")
	public void i_click_in_the_Subject_Heading_tab_to_select_Customer_service_from_the_drop_down_menu() throws Throwable {
		new Select(driver.findElement(By.id("id_contact"))).selectByVisibleText("Customer service");
	}

	@Then("^I click on the Order reference tab to select my latest order from the list$")
	public void i_click_on_the_Order_reference_tab_to_select_my_latest_order_from_the_list() throws Throwable {
		new Select(driver.findElement(By.name("id_order"))).selectByVisibleText("LFDMJCGAC - 05/13/2020");
	}

	@Then("^I click on the Product tab to select the item size and colour$")
	public void i_click_on_the_Product_tab_to_select_the_item_size_and_colour() throws Throwable {
		new Select(driver.findElement(By.id("166_order_products"))).selectByVisibleText("Blouse - Size : M, Color : White");
	}

	@When("^I wrote inside the message box provide$")
	public void i_wrote_inside_the_message_box_provide() throws Throwable {
		driver.findElement(By.id("message")).sendKeys("This is an Automated Test by DanTheMan!");
	}

	@Then("^I click on the Send button$")
	public void i_click_on_the_Send_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#submitMessage > span")).click();
	}


	@Then("^I click on my ORDER HISTORY AND DETAILS$")
		public void i_click_on_my_ORDER_HISTORY_AND_DETAILS() throws Throwable {
			driver.findElement(By.xpath("//div[@id='center_column']/div/div/ul/li/a/span")).click();
		}

		@Then("^I assert text on all orders placed since account creation$")
		public void i_assert_text_on_all_orders_placed_since_account_creation() throws Throwable {
			driver.findElement(By.id("center_column")).click();
			assertEquals("Here are the orders you've placed since your account was created.",
					driver.findElement(By.xpath("//div[@id='center_column']/p")).getText());
		}

		@Then("^I take a screenshot$")
		public void i_take_a_screenshot() throws Throwable {
			driver.manage().window().maximize();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./TakesScreenshot/CarGuruji.png"));
			System.out.println("Screenshot Taken Successfully");

		}

		@Then("^I click on my first order to see the details$")
		public void i_click_on_my_first_order_to_see_the_details() throws Throwable {
			driver.findElement(By.linkText("GZUOXNHFL")).click();

		}

		@Then("^I confirm the order refference and date placed$")
		public void i_confirm_the_order_refference_and_date_placed() throws Throwable {
			driver.findElement(By.xpath("//div[@id='block-order-detail']/div")).click();
			assertEquals("Order Reference GZUOXNHFL - placed on 05/09/2020",
					driver.findElement(By.xpath("//form[@id='submitReorder']/p/strong")).getText());
		}

		@Then("^I click on my latest order to see the details$")
		public void i_click_on_my_latest_order_to_see_the_details() throws Throwable {
			driver.findElement(By.linkText("LLAENLJEU")).click();

		}

		@Then("^I affirm the order refference and date it was placed$")
		public void i_affirm_the_order_refference_and_date_it_was_placed() throws Throwable {
			driver.findElement(By.xpath("//div[@id='block-order-detail']/div")).click();
			assertEquals("Order Reference LLAENLJEU - placed on 05/17/2020",
					driver.findElement(By.xpath("//form[@id='submitReorder']/p/strong")).getText());
		}

		@Then("^I click on the Product tab so as to select the item size and colour$")
		public void i_click_on_the_Product_tab_so_as_to_select_the_item_size_and_colour() throws Throwable {
			driver.findElement(By.name("id_product")).click();
			new Select(driver.findElement(By.name("id_product"))).selectByVisibleText("Blouse - Size : M, Color : White");
		}

		@When("^I Added a message into the info box provided$")
		public void i_Added_a_message_into_the_info_box_provided() throws Throwable {
			driver.findElement(By.name("msgText")).sendKeys("This is just an overview Test!");
		}

		@Then("^I click Send$")
		public void i_click_Send() throws Throwable {
			driver.findElement(By.xpath("//form[@id='sendOrderMessage']/div/button/span")).click();
		}

		@When("^I click on the MY CREDIT SLIPS button$")
		public void i_click_on_the_MY_CREDIT_SLIPS_button() throws Throwable {
			driver.findElement(By.xpath("//div[@id='center_column']/div/div/ul/li[2]/a/span")).click();
		}

		@Then("^I verify the message within and take a screen shot$")
		public void i_verify_the_message_within_and_take_a_screen_shot() throws Throwable {
			driver.findElement(By.xpath("//div[@id='block-history']/p")).click();
			assertEquals("You have not received any credit slips.",
					driver.findElement(By.xpath("//div[@id='block-history']/p")).getText());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./TakesScreenshot/MycreditSlips.png"));
			System.out.println("Screenshot Taken Successfully");

		}

	@When("^I click on forgot password link$")
	public void i_click_on_forgot_password_link() throws Throwable {
		driver.findElement(By.cssSelector("#login_form > div > p.lost_password.form-group > a")).click();
	}

	@When("^I click on Retrieve Password button$")
	public void i_click_on_Retrieve_Password_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")).click();
	}

	@Then("^I Verify the given message$")
	public void i_Verify_the_given_message() throws Throwable {
		driver.findElement(By.xpath("//div[@id='center_column']/div/p")).click();
		assertEquals("A confirmation email has been sent to your address: lukebible@mail.com",
				driver.findElement(By.xpath("//div[@id='center_column']/div/p")).getText());
			System.out.println();
	}


}
