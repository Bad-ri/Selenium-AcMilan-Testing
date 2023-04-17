package Pages;

import Base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends Browser{
//    WebDriver driver ;
//    public loginPage(WebDriver driver){
//        this.driver = driver;
//    }
    By my_account = By.xpath("//button[@class=\"CommonButton-sc-1yxf0nj-0 LoginControl__LoginButton-ir0fc9-1 jnLfVD\"]");
    By username = By.xpath("//input[@id=\"37:2;a\"]");
    By password = By.xpath("//input[@id=\"47:2;a\"]");
    By login_button = By.xpath("//button[@class=\"slds-button slds-button--neutral sfdc_button uiButton\"]");
    //class="CommonButton-sc-1yxf0nj-0 LoginControl__LoginButton-ir0fc9-1 jnLfVD"
    By message = By.xpath("//div[@class=\"uiOutputRichText\"]");
    String Expected = "Invalid username or password";
    public void openLoginPage() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().findElement(my_account).click();
        Thread.sleep(3000);
    }
    public void enterUserInformation(){}
    public void clickLoginButton(){}
    public void notificationCheck(){}
}
