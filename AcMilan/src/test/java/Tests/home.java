package Tests;

import Base.browserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class home extends browserBase {

    @Given("open news menu")
    public void openMenu(){
        home.clickOnNews();
    }
    @And("browse page")
    public void openAllNewsSection() throws InterruptedException {
        home.browsePage();
    }
    @And("verify page")
    public void verifyPage(){
        home.verifyPage();
    }
}
