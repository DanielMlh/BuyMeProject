package Registration;

import org.openqa.selenium.By;

public class ConstantsReg {
    public  static final By signedBtn= By.cssSelector("li[class=notSigned]");
    public  static final By logRegBtn= By.cssSelector("span.text-link.theme");
    public  static final By fieldName= By.cssSelector("input[id=ember1863]");
    public  static final By fieldEmail= By.id("ember1869");
    public  static final By fieldPassword= By.id("valPass");
    public  static final By fieldConfirmPassword= By.id("ember1883");
    public  static final By selectConfirm= By.xpath("//*[@id=\"ember1890\"]/div/span[1]");

    public  static final By submitRegBtn= By.cssSelector("button[id=ember1894]");

}
