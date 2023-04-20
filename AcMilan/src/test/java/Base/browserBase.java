package Base;

import Pages.homePage;
import Pages.loginPage;
import Actions.javaScriptClass;
import Pages.signUpPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class browserBase {
  protected static WebDriver driver;
  protected static Logger log = (Logger) LogManager.getLogger();
  protected static loginPage login = new loginPage();
  protected static homePage home = new homePage();
  protected static javaScriptClass js = new javaScriptClass();
  protected static signUpPage register = new signUpPage();

  public void openMilanWebsite(){
    driver.get("https://www.acmilan.com/en");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
  public void openBrowserSetup(String input) {
    switch(input){
      case "edge":
        setupEdgeBrowser();
        //maximizeWindow();
        break;
      case "chrome":
        setupChromeBrowser();
        //maximizeWindow();
        break;
      default:
        notSupported();
        break;
    }
  }
  public void setupEdgeBrowser(){
    String edgePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\msedgedriver.exe";
    EdgeOptions options = new EdgeOptions();
    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
    options.setExperimentalOption("useAutomationExtension", false);
    options.addArguments("--start-maximized");
    options.addArguments ("--headless");
    driver = new EdgeDriver(options);
    System.setProperty("webdriver.edge.driver",edgePath);
  }

  public static void main(String[] args) {

  }
  public void setupChromeBrowser(){
    String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\chromedriver.exe";
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
    options.setExperimentalOption("useAutomationExtension", false);
    //options.addArguments ("--headless");
    driver = new ChromeDriver(options);
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
