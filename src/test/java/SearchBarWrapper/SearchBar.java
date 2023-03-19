package SearchBarWrapper;

import WebSettings.BasePage;
import WebSettings.DriverSingleton;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchBar extends BasePage {
        WebDriverWait wait=new WebDriverWait(DriverSingleton.getDriverInstance(), Duration.ofSeconds(10));

public void selectPrice(){

clickFeildPrice();
clickPrice();
}
public void selectDistrict(){
        clickFeildDistrict();
        clickDistrict();
}
public void selectCategory(){
        clickFeildCategory();
        clickCategory();
}
public void clickSearchBtn(){

clickElementJs(LocatorsSrch.searchBtn);
}

//----------------
private void clickFeildPrice(){
        clickElement(LocatorsSrch.selectFeildPrice);
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsSrch.selectFeildPrice));
}
private void clickPrice(){
        clickElement(LocatorsSrch.selectPrice);
}
private void clickFeildDistrict(){
        clickElement(LocatorsSrch.selectFeildDistrict);
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsSrch.selectFeildDistrict));
}
private void clickDistrict(){
        clickElement(LocatorsSrch.selectDistrict);
}
private void clickFeildCategory(){
        clickElement(LocatorsSrch.selectFeildCategory);
        wait.until(ExpectedConditions.elementToBeClickable(LocatorsSrch.selectFeildDistrict));
}
private void clickCategory(){
        clickElement(LocatorsSrch.selectCategory);
}


}
