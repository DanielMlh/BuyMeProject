import PickBusiness.Business;
import Registration.ConstantsReg;
import Registration.LocatorsPage;
import SearchBarWrapper.SearchBar;
import SenderReceiverScreen.LocatorsSender;
import SenderReceiverScreen.SenderReceiver;
import WebSettings.DriverSingleton;
import WebSettings.SetupDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestBuyMe {
private static ExtentReports extent;
private static ExtentTest test;
private String timeNow;

    @BeforeClass
public void setup(){
 SetupDriver setupDriver=new SetupDriver();
 setupDriver.RunPage();
 ExtentSparkReporter htmlReporter=new ExtentSparkReporter("C:\\Users\\D\\Downloads\\23-11_אוטומציה\\Class_10\\Second Project\\BuyMe\\extendReport\\extend.html");
 extent=new ExtentReports();
 extent.attachReporter(htmlReporter);
 test=extent.createTest("BuyMe","description");
 test.log(Status.INFO,"@BeforeClass");
 timeNow=String.valueOf(System.currentTimeMillis());
}


//---------Intro & Registration screen Test
@Test(priority = 1)
    public void registrationScreen(){
    test=extent.createTest("Registration screen","description");
    LocatorsPage regPage=new LocatorsPage();
    try {
        regPage.regBtn();
        test.log(Status.PASS,"Registration button");
    }
    catch (Exception e){
        test.fail("Error:Registration button "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }

    try {
        regPage.logRegBtn();
        test.log(Status.PASS,"Login button");
    }
    catch (Exception e){
test.fail("Error:Login button "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }

    try {
        regPage.fieldsReg();
        test.log(Status.PASS,"Input feilds");
    }
    catch (Exception e){
    test.fail("Error: Input feilds "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }
       Assert.assertEquals("Moshe",DriverSingleton.getDriverInstance().findElement(ConstantsReg.fieldName).getAttribute("value"));
        Assert.assertEquals("moshetest@test7.com",DriverSingleton.getDriverInstance().findElement(ConstantsReg.fieldEmail).getText());
    try {
        regPage.selectConfirm();
        test.log(Status.PASS,"Select check confirm");
    }
    catch (Exception e){
        test.fail("Error:Select check confirm "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }
    try {
        regPage.submitRegBtn();
        test.log(Status.PASS,"Submit registration button");
    }
    catch (Exception e){
        test.fail("Error:Submit registration button "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }

}
//---------Home Screen Test
@Test(priority = 2)
    public void searchScreen(){
    test=extent.createTest("Search screen","description");
    SearchBar searchBar=new SearchBar();
    try{
        searchBar.selectPrice();
        test.pass("Select feild price");
    }
    catch (Exception e){
        test.fail("Erroe:Select feild price "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }

    try{
        searchBar.selectDistrict();
        test.log(Status.PASS,"Select feild district:");
    }
    catch (Exception e){
        test.fail("Error: Select feild district "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }

    try{
        searchBar.selectCategory();
        test.log(Status.PASS,"Select feild category:");
    }
    catch (Exception e){
        test.fail("Error: Select feild category "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }

    try{
        searchBar.clickSearchBtn();
        test.log(Status.PASS,"Click search button");
    }
    catch (Exception e){
        test.fail("Error: Click search button "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
    }


}
//--------Pick business screen Test
 @Test(priority = 3)
    public void businessScreen(){
     test=extent.createTest("Business screen","description");

      String url= DriverSingleton.getDriverInstance().getCurrentUrl();
     try{
         Assert.assertEquals("https://buyme.co.il/search?budget=1&category=438&region=11",url);
         test.log(Status.PASS,"Url ");
     }
     catch (Exception e){
         test.log(Status.FAIL,"Error: Error "+e.getClass());
     }

     Business business=new Business();
     try{
         business.pickBusiness();
         test.log(Status.PASS,"Pick business: ");
     }
     catch (Exception e){
         test.fail("Error: Pick business "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
     }

     try{
         business.pickCard();
         test.log(Status.PASS,"Pick card: ");
     }
     catch (Exception e){
         test.fail("Error: Pick card "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
     }

 }
 //----------Pick business screen 2 Test
    @Test(priority = 4)
    public void SenderScreen1(){
        test=extent.createTest("Sender screen 1","description");
        SenderReceiver senderReceiver=new SenderReceiver();
        try{
            senderReceiver.sendPic();
            test.log(Status.PASS,"Send picture ");
        }
        catch (Exception e){
            test.log(Status.FAIL,"Error: Send picture "+e.getClass());
        }

        try{
            senderReceiver.pickToAnother();
            test.log(Status.PASS,"Pick to another: ");
        }
        catch (Exception e){
            test.fail("Error: Pick to another "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }

        try{
            senderReceiver.fieldName();
            Assert.assertEquals("Moshe",DriverSingleton.getDriverInstance().findElement(LocatorsSender.inpunSenderName).getText());
            Assert.assertEquals("Moshe",DriverSingleton.getDriverInstance().findElement(LocatorsSender.fieldName).getText());
            test.log(Status.PASS,"Field name ");
        }

        catch (Exception e){
            test.fail("Error: Field name "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }

        try{
            senderReceiver.selectFeildEvent();
            test.log(Status.PASS,"Select feild event ");
        }
        catch (Exception e){
            test.fail("Error: Select feild event "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }

        try{
            senderReceiver.writeGreeting();
            test.log(Status.PASS,"Write greeting ");
        }
        catch (Exception e){
            test.fail("Error: Write greeting "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }

        try{
            senderReceiver.continueBtn();
            test.log(Status.PASS,"Continue Button: ");
        }
        catch (Exception e){
            test.fail("Error: Continue Button "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }

    }
    //---------Sender & Receiver information screen Test
    @Test(priority = 5)
    public void SenderScreen2(){
    test=extent.createTest("Sender screen 1","description");
        SenderReceiver senderReceiver2=new SenderReceiver();
        try{
            senderReceiver2.selectNow();
            test.log(Status.PASS,"Select check now: ");
        }
        catch (Exception e){
            test.fail("Error: Select check now "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());

        }

        try{
            senderReceiver2.selectEmail();
            test.log(Status.PASS,"Select email: ");
        }
        catch (Exception e){
            test.fail("Error: Select email "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }

        try{
            senderReceiver2.inputSenderName();
            test.log(Status.PASS,"Input sender name: ");
        }
        catch (Exception e){
            test.fail("Error: Input sender name "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }

        try{
            senderReceiver2.btnToPay();
            test.log(Status.PASS,"Button to pay: ");
        }
        catch (Exception e){
            test.fail("Error: Button to pay "+e.getClass(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }

    }
    //---------
    @AfterClass
    public void afterClass(){
        DriverSingleton.getDriverInstance().quit();
        extent.flush();
    }
//----------Take screen shot function
    private static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) DriverSingleton.getDriverInstance();
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\D\\Downloads\\23-11_אוטומציה\\Class_10\\Second Project\\BuyMe\\extendReport\\" + ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath + ".png";
    }
}
