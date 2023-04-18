package Base;

import Base.browserBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class browser {
    browserBase browser = new browserBase();

    public static void main(String[] args) {

    }
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
