package stepDefination;

import Base.browserBase;
import io.cucumber.java.en.Then;

public class browser {
    browserBase browser = new browserBase();

    public static void main(String[] args) {

    }

    public void openBrowser(String input){

        browser.openBrowserSetup(input);
    }
    public void openWebsite(){

        browser.openMilanWebsite();
    }
    public void closeBrowser(){

        browser.browserTermination();
    }
}
