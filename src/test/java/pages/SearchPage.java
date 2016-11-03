package pages;


import org.openqa.selenium.WebDriver;
import utils.Driver;

public class SearchPage {
    private static boolean pageLoaded;

    private static WebDriver driver;
    public static void goTo() {
         driver = Driver.instance();
        driver.get("http://google.com/");

    }

    public static boolean isPageLoaded() {
        return pageLoaded;
    }
}
