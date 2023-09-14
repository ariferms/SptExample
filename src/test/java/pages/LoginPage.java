package pages;

import drivers.Driver;
import methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Driver {
    public final String oturumAcButton = "//div//button//span[text()='Oturum aç']";
    public final String userName = "login-username";
    public final String password = "login-password";
    public final String loginButton = "login-button";
    public final String user = "arif.ermis@testinium.com";
    public final String pass = "Agustos2022*";

    public void loginButtonClickTest(Methods method) {
        method.WaitUntilTheElementArrives(By.xpath(oturumAcButton));
        Assertions.assertTrue(method.visible(By.xpath(oturumAcButton)));
        method.clickElement(By.xpath(oturumAcButton));
    }

    public void nameEntryTest(Methods method){
        // Username
        method.WaitUntilTheElementArrives(By.id(userName));
        Assertions.assertTrue(method.visible(By.id(userName)));
        method.sendKey(By.id(userName),user);
    }

    public void passwordEntryTest(Methods method){
        // Password
        method.WaitUntilTheElementArrives(By.id(password));
        Assertions.assertTrue(method.visible(By.id(password)));
        method.sendKey(By.id(password),pass);
    }

    public void loginButtonClick(Methods method){
        // Login Button
        method.WaitUntilTheElementArrives(By.id(loginButton));
        Assertions.assertTrue(method.visible(By.id(loginButton)));
        method.clickElement(By.id(loginButton));
    }

}
