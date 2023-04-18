package Tests;

import Base.Browser;
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
    }
}
