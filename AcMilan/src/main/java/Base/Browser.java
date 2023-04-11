package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
  WebDriver driver;
  public WebDriver getDriver(){
    return driver;
  }
  public void openWebsite() throws InterruptedException {
    driver.get("https://www.acmilan.com/en");
    Thread.sleep(2000);
  }
  public void openBrowser() {
    String driverPath = System.getProperty("user.dir") + "src/main/resources/Driver/msedgedriver.exe" ;
    driver = new EdgeDriver();
    System.setProperty("webdriver.edge.driver",driverPath);
  }
  public void closeBrowser(){
    driver.quit();
  }
}
