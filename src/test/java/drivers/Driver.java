package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public WebDriver driver;

    public void drivers(String browser){
        switch (browser){
            case "Chromer":
                driver = new ChromeDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://open.spotify.com/");
    }
}
