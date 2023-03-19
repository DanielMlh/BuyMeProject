package SenderReceiverScreen;

import WebSettings.BasePage;


public class SenderReceiver extends BasePage {

    public void pickToAnother(){
        clickElementJs(LocatorsSender.pickToAnother);
    }
    public void fieldName(){
        sendKeysToElement(LocatorsSender.fieldName,"Moshe");

    }

    public void selectFeildEvent(){
        clickFeildEvent();
        clickEvent();
    }
    public void writeGreeting(){
        sendKeysToElement(LocatorsSender.writeGreeting,"מזל טוב");
    }
    public void sendPic(){
        sendKeysToElement(LocatorsSender.sendPic,"C:\\Users\\D\\Downloads\\23-11_אוטומציה\\Class_10\\Second Project\\BuyMe\\pics\\send1.jpg");
    }
    public void continueBtn(){
        clickElement(LocatorsSender.continueBtn);
    }
    //-------
    public void selectNow(){
        clickElementJs(LocatorsSender.selectNow);
    }
    public void selectEmail(){
        clickEmail();
        inputEmail();
    }
    public void inputSenderName(){
        sendKeysToElement(LocatorsSender.inpunSenderName,"Moshe");
    }
    public void btnToPay(){
        clickElement(LocatorsSender.btnToPay);
    }
    //-------pivert functions------
    private void clickFeildEvent(){
        clickElement(LocatorsSender.selectFeildEvent);

    }
    private void clickEvent(){
        clickElement(LocatorsSender.selectEvent);

    }
    private void clickEmail(){
        clickElement(LocatorsSender.selectEmail);
    }
    private void inputEmail(){
        sendKeysToElement(LocatorsSender.inpunEmail,"moshe@test.com");
    }

}
