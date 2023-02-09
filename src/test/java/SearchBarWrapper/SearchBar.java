package SearchBarWrapper;

import WebSettings.BasePage;
import WebSettings.DriverSingleton;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
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

clickElementJs(ConstantsSrch.searchBtn);
}

//----------------
private void clickFeildPrice(){
        clickElement(ConstantsSrch.selectFeildPrice);
        wait.until(ExpectedConditions.elementToBeClickable(ConstantsSrch.selectFeildPrice));
}
private void clickPrice(){
        clickElement(ConstantsSrch.selectPrice);
}
private void clickFeildDistrict(){
        clickElement(ConstantsSrch.selectFeildDistrict);
        wait.until(ExpectedConditions.elementToBeClickable(ConstantsSrch.selectFeildDistrict));
}
private void clickDistrict(){
        clickElement(ConstantsSrch.selectDistrict);
}
private void clickFeildCategory(){
        clickElement(ConstantsSrch.selectFeildCategory);
        wait.until(ExpectedConditions.elementToBeClickable(ConstantsSrch.selectFeildDistrict));
}
private void clickCategory(){
        clickElement(ConstantsSrch.selectCategory);
}


}
