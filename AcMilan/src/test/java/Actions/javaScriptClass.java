package Actions;

import Base.browserBase;
import org.openqa.selenium.JavascriptExecutor;

public class javaScriptClass extends browserBase {
    public void scroll(int pixels){
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,"+pixels+")");
    }

    public static void main(String[] args) {

    }
}
