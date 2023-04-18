package Pages;

import Base.browserBase;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class homePage extends browserBase {
    By news = By.xpath("//div[@class=\"NavigationHeader__Container-sc-17yzsi6-0 iupwjg\"]/nav[1]/ul[1]/li[1]/div[1]/a[1]");
    By register = By.xpath("//*[@data-aura-rendered-by=\"12:58;a\"]");
    public void clickOnNews(){
        getDriver().findElement(news).click();
    }
    public void browsePage(){
        js.scroll(550);
    }
    public void verifyPage(){
        String Actual = getDriver().getTitle();
        String Expected = "AC Milan News - Latest and real time updates";
        Assert.assertTrue(Actual.contains(Expected));
    }
    public void openRegister(){
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getDriver().findElement(register).click();
    }
}
