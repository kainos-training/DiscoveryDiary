package pages;

import utils.Driver;
import org.openqa.selenium.WebDriver;

public class HomePage {

    static WebDriver driver;
    private static boolean pageLoaded;

    public static void goTo() {
        driver = Driver.instance();
        driver.get("http://google.com");
    }

    public static boolean isPageLoaded() {
        return pageLoaded;
    }
}
