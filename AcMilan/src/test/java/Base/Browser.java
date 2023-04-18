package Base;

import Pages.loginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class Browser{
  protected static WebDriver driver;
  protected static Logger log = (Logger) LogManager.getLogger();
  protected static loginPage login = new loginPage();
  public void openMilanWebsite(){
    driver.get("https://www.acmilan.com/en");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
  public void openBrowserSetup(String input) {
    switch(input){
      case "edge":
        setupEdgeBrowser();
        maximizeWindow();
        break;
      case "chrome":
        setupChromeBrowser();
        maximizeWindow();
        break;
      default:
        notSupported();
        break;
    }
  }
  public void setupEdgeBrowser(){
    String edgePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\msedgedriver.exe";
    driver = new EdgeDriver();
    System.setProperty("webdriver.edge.driver",edgePath);
  }
  public void setupChromeBrowser(){
    String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\chromedriver.exe";
    driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver",chromePath);
  }
  public void notSupported(){
    log.error("not supported browser");
  }
  public void maximizeWindow(){
    driver.manage().window().maximize();
  }
  public void browserTermination(){
    if(driver!=null){
      driver.close();
      driver.quit();
    }
  }
  public WebDriver getDriver(){
    return driver;
  }
}
