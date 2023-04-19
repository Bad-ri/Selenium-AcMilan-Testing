package Pages;

import Base.browserBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class signUpPage extends browserBase {
    public static void main(String[] args) {

    }
    By email = By.xpath("//input[@id=\"input-0\"]");
    By first_name = By.xpath("//input[@id=\"input-1\"]");
    By last_name = By.xpath("//input[@id=\"input-2\"]");
    By privacy_box = By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[7]/p[2]/label/lightning-input/div[1]/span");
    By register_button = By.xpath("//button[@class=\"slds-button slds-button_destructive submitBtn\"]");
    By message = By.xpath("//*[@data-aura-rendered-by=\"89:2;a\"]");
    public void enterUserEmail(String input) {
        home.browsePage();
        getDriver().findElement(email).sendKeys(input);
    }
    public void enterUserFirstName(String input){
        getDriver().findElement(first_name).sendKeys(input);
    }
    public void enterUserLastName(String input){
        getDriver().findElement(last_name).sendKeys(input);
    }
    public void ClickOnPrivacyCheckBox(){
        getDriver().findElement(privacy_box).click();
    }
    public void ClickOnRegisterButton(){
        getDriver().findElement(register_button).click();
    }
    public void notificationCheck() throws InterruptedException {
        Thread.sleep(3000);
        String Expected = "Email already used";
        String Actual = getDriver().findElement(message).getText();
        Assert.assertTrue(Expected.contains(Actual));
    }

}
