package methods;

import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Methods extends Driver {
    private static final Logger logger = LogManager.getLogManager().getLogger("message");
Driver driverSetting;
    public Methods(Driver driverSetting) {
        this.driverSetting = driverSetting;
    }

    public void clickElement(By by){
        try {
            driverSetting.driver.findElement(by).click();
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Aranan objeye tıklanamadı.");
        }
    }

    public boolean visible(By by){
        try {
            return driverSetting.driver.findElement(by).isEnabled();
        } catch (Exception e){
            return false;
        }
    }
    public void WaitUntilTheElementArrives(By by){
        WebDriverWait wait = new WebDriverWait(driverSetting.driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void sendKey(By by, String value){
        try {
            WebElement element = driverSetting.driver.findElement(by);
            element.sendKeys(value);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("İstenen değer girilemedi.");
        }
    }

    public void allWindowsExit(){
        driverSetting.driver.quit();
    }
}
