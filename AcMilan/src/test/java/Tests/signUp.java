package Tests;

import Base.browserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class signUp extends browserBase {
    public static void main(String[] args) {

    }

    @Given("open registration page")
    public void openRegisterPage() throws InterruptedException {
        home.openRegister();
    }
    @And("^user enters email \"(.*)\"$")
    public void enterEmail(String email) throws InterruptedException {
        Thread.sleep(3000);
        register.enterUserEmail(email);
    }
    @And("^user enters first name \"(.*)\"$")
    public void enterFirstName(String first_name){
        register.enterUserFirstName(first_name);
    }
    @And("^user enters last name \"(.*)\"$")
    public void enterLastName(String last_name){
        register.enterUserLastName(last_name);
    }
    @And("user enables the privacy check box")
    public void enableCheckBox(){
        register.ClickOnPrivacyCheckBox();
    }
    @And("click on register button")
    public void ClickRegisterButton(){
        register.ClickOnRegisterButton();
    }
    @And("verify registration")
    public void messageCheck() throws InterruptedException {
        register.notificationCheck();
    }

}
