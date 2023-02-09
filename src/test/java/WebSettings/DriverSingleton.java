package WebSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static WebDriver driver;
    private static XmlData xmlData =new XmlData();

    public DriverSingleton() {
    }

    public static WebDriver getDriverInstance() {
        String type= xmlData.getData("browserType");
        if(driver==null){
            switch (type) {
                case "chrome":
                System.setProperty(xmlData.getData("chromeDriver109"), xmlData.getData("chromePath"));
                driver = new ChromeDriver();
                break;
            }
        }
     return driver;
    }

}
