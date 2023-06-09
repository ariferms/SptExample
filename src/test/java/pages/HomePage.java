package pages;

import drivers.Driver;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Driver {
    public final String oturumAcButton = "//div//button//span[text()='Oturum aç']";
    public final String cookiesNotification = "//div//div[@aria-describedby=\"onetrust-policy-text\"]";
    public final String cookiesNotificationQuitObject = "//div//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]";

    public void cookiesQuit(Methods method){
        method.WaitUntilTheElementArrives(By.xpath(oturumAcButton));
        if (method.visible(By.xpath(cookiesNotification))){
            method.clickElement(By.xpath(cookiesNotificationQuitObject));
        }
    }

}
