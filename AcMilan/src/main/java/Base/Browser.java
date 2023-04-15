package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class Browser {
  WebDriver driver;
  public void openMilanWebsite(){
    driver.get("https://www.acmilan.com/en");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    // wait till page fully wait
    //    new WebDriverWait(driver, Duration.ofSeconds(3)).until( webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
  }
  public void openBrowserSetup(String input) {
    switch(input){
      case "edge":
        setupEdgeBrowser();
        break;
      case "chrome":
        setupChromeBrowser();
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
    driver.manage().window().maximize();
  }
  public void setupChromeBrowser(){

    System.out.print("under construction");
  }
  public void notSupported(){

    System.out.print("not supported browser");
  }
  public void browserTermination(){

    driver.quit();
  }
  public WebDriver getDriver(){
    return driver;
  }
}
