package Tests;

import Base.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class home {
    Browser browser = new Browser();
    @Given("^open browser\"(.*)\"$")
    public void openBrowser(String input){

        browser.openBrowserSetup(input);
    }
    @When("open Website")
    public void openWebsite(){

        browser.openMilanWebsite();
    }
    @Then("close browser")
    public void closeBrowser(){

        browser.browserTermination();
    }
}
