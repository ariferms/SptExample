import drivers.Driver;
import methods.Methods;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class TestMain extends Driver {
    HomePage homePage;
    LoginPage loginPage;
    Driver driverSetting= new Driver();
    Methods method = new Methods(driverSetting);
    @BeforeAll
    public static void firstStep(){
        System.out.println("******************Before All*******************");
    }

    @BeforeEach
    public void setup() {
        driverSetting.drivers("Chrome");
    }

    @Test
    public void testLogin(){
        System.out.println("Spotify Login Test");
        init();

        // Cookies
        homePage.cookiesQuit(method);

        // Login
        loginPage.loginButtonClickTest(method);
        loginPage.nameEntryTest(method);
        loginPage.passwordEntryTest(method);
        loginPage.loginButtonClick(method);

    }

    @AfterEach
    public void tearDown() {
        method.allWindowsExit();
    }

    @AfterAll
    public static void endStep(){
        System.out.println("******************After All*******************");
    }

    public void init(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
}
