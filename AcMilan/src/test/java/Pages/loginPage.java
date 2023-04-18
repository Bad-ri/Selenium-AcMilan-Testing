package Pages;

import Base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class loginPage extends Browser{
    public static void main(String[] args) {

    }
    By my_account = By.xpath("//button[@class=\"CommonButton-sc-1yxf0nj-0 LoginControl__LoginButton-ir0fc9-1 jnLfVD\"]");
    By username = By.xpath("//input[@id=\"37:2;a\"]");
    By password = By.xpath("//input[@id=\"47:2;a\"]");
    By login_button = By.xpath("//button[@class=\"slds-button slds-button--neutral sfdc_button uiButton\"]");
    //class="CommonButton-sc-1yxf0nj-0 LoginControl__LoginButton-ir0fc9-1 jnLfVD"
    By message = By.xpath("//div[@class=\"uiOutputRichText\"]");
    public void openLoginPage() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().findElement(my_account).click();
    }
    public void enterUserInformation(String User, String Pass){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().findElement(username).sendKeys(User);
        getDriver().findElement(password).sendKeys(Pass);
    }
    public void clickLoginButton(){
        getDriver().findElement(login_button).click();
    }
    public void notificationCheck(){
        WebElement notificationMessage = getDriver().findElement(message);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(notificationMessage));
        String Actual = notificationMessage.getText();
        String Expected = "Username o password non sono corrette";
        Assert.assertTrue(Actual.contains(Expected));
    }
}
