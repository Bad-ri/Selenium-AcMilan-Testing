package Tests;

import Base.Browser;
import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class login extends Browser {
    public static void main(String[] args) {

    }
    @Given("open login page")
    public void openLoginPage() throws InterruptedException {
        login.openLoginPage();
    }

    @And("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
    public void enterUserInformation(String username,String password){
        log.info(username);
        log.info(password);
    }
    @And("click login button")
    public void clickLoginButton(){}
    @And("verify login")
    public void verifyLogin(){}
}
