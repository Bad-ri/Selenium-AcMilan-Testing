package stepDefination;

import Base.browserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class login extends browserBase {
    public static void main(String[] args) {

    }
    browser bro = new browser();
    public login(){

        bro.openBrowser("edge");
        bro.openWebsite();
    }

    @Given("open login page")
    public void openLoginPage() throws InterruptedException {
        login.openLoginPage();
    }

    @And("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
    public void enterUserInformation(String username,String password) {
        login.enterUserInformation("mohamed","elbadri");
    }
    @And("click login button")
    public void clickLoginButton() {
        login.clickLoginButton();

    }
    @And("verify login")
    public void verifyLogin(){

        login.notificationCheck();
        bro.closeBrowser();
    }
}
