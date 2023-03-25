package WebSettings;

import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class SetupDriver {
    private WebDriver driver;
   private static XmlData xmlData=new XmlData();
    public SetupDriver(){
        this.driver=DriverSingleton.getDriverInstance();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
    }
public WebDriver getDriver(){
        return driver;
}
    public void RunPage(){
        this.driver.get(xmlData.getData("homePageURL"));

    }
}
