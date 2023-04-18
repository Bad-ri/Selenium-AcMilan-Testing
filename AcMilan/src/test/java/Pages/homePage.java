package Pages;

import Base.browserBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class homePage extends browserBase {
    By news = By.xpath("//div[@class=\"NavigationHeader__Container-sc-17yzsi6-0 iupwjg\"]/nav[1]/ul[1]/li[1]/div[1]/a[1]");
    //By news_menu = By.xpath("//div[@class=\"NavigationHeader__Container-sc-17yzsi6-0 iupwjg\"]/nav[1]/ul[1]/li[1]/div[1]/div[1]");
    public void clickOnNews(){
        getDriver().findElement(news).click();
    }
    public void browsePage() throws InterruptedException {
        js.scroll(550);
        Thread.sleep(3000);
    }
    public void verifyPage(){
        String Actual = getDriver().getTitle();
        String Expected = "AC Milan News - Latest and real time updates";
        Assert.assertTrue(Actual.contains(Expected));
    }


}
