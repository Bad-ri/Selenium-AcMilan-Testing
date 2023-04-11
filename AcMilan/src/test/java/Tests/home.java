package Tests;

import Base.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class home {
    Browser browser = new Browser();

    @Given("open browser")
    public void openBrowser(){
        browser.openBrowser();
    }
    @When("open Website")
    public void openWebsite() throws InterruptedException {
//        WebDriver driver = browser.getDriver();
//        driver.get("https://www.google.com.eg/");
//        Thread.sleep(3000);
        browser.openWebsite();
    }
    @Then("close browser")
    public void closeBrowser(){
        browser.closeBrowser();
    }
}
