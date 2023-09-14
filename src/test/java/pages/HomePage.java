package pages;

import drivers.Driver;
import methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends Driver {
    public final String oturumAcButton = "//div//button//span[text()='Oturum aç']";
    public final String cookiesNotification = "//div//div[@aria-describedby=\"onetrust-policy-text\"]";
    public final String cookiesNotificationQuitObject = "//div//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]";
    public final String fieldSearch = "//li//a[@aria-label=\"Ara\"]";
    public final String reklam = "//div[@data-testid=\"inAppMessageContainer\"]";
    public final String reklamClosed = "//div//button[@data-click-to-action-action=\"DISMISS\"]";
    public final String setSearchField = "semicenk";
    public final String clikToRigthMyList = "//div[@class=\"ifVI2CEdOZGgMWIUN2Cw\"]";
    public final String clikToRigthMyListCalmaListesi = "//div//ul//li//button//span[text()=\"Çalma listesi oluştur\"]";
    public final String calmaListemSayfa = "//div[@class=\"_gLjHpwOxHFwo5nLM8hb\"]";

    // Cookies
    public void cookiesQuit(Methods method) {
        method.WaitUntilTheElementArrives(By.xpath(oturumAcButton));
        if (method.visible(By.xpath(cookiesNotification))) {
            method.clickElement(By.xpath(cookiesNotificationQuitObject));
        }
    }

    //reklam
    public boolean reklamClose(Methods method) {
        method.WaitUntilTheElementArrives(By.xpath(reklam));
        if (method.visible(By.xpath(reklam))) {
            method.clickElement(By.xpath(reklamClosed));
        }
        return false;
    }

    //arabutonu
    public void aramaYapClick(Methods method) {
        method.WaitUntilTheElementArrives(By.xpath(fieldSearch));
        Assertions.assertTrue(method.visible(By.xpath(fieldSearch)));
        method.clickElement(By.xpath(fieldSearch));
    }

    public void aramaYap(Methods method) {
        method.sendKey(By.xpath(fieldSearch), setSearchField);
        method.enterClick(By.xpath(fieldSearch));
    }

    public void createMyList(Methods method) {
        method.rigthClick(By.xpath(clikToRigthMyList));
        method.visible(By.xpath(clikToRigthMyListCalmaListesi));
        method.clickElement(By.xpath(clikToRigthMyListCalmaListesi));
        method.WaitUntilTheElementArrives(By.xpath(calmaListemSayfa));
    }

}
