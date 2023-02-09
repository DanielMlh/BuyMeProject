package WebSettings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    public void clickElement(By locator){
        getWebElement(locator).click();
    }
    public void clickElementJs(By locator){
        JavascriptExecutor js=(JavascriptExecutor)DriverSingleton.getDriverInstance();
        js.executeScript("arguments[0].click();",getWebElement(locator));

    }
    public void sendKeysToElement(By locator,String text){
    getWebElement(locator).sendKeys(text);
    }
    private WebElement getWebElement(By locator){
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

}
