package SenderReceiverScreen;

import WebSettings.BasePage;


public class SenderReceiver extends BasePage {

    public void pickToAnother(){
        clickElementJs(ConstantsSender.pickToAnother);
    }
    public void fieldName(){
        sendKeysToElement(ConstantsSender.fieldName,"Moshe");

    }

    public void selectFeildEvent(){
        clickFeildEvent();
        clickEvent();
    }
    public void writeGreeting(){
        sendKeysToElement(ConstantsSender.writeGreeting,"מזל טוב");
    }
    public void sendPic(){
        sendKeysToElement(ConstantsSender.sendPic,"C:\\Users\\D\\Downloads\\23-11_אוטומציה\\Class_10\\Second Project\\BuyMe\\pics\\send1.jpg");
    }
    public void continueBtn(){
        clickElement(ConstantsSender.continueBtn);
    }
    //-------
    public void selectNow(){
        clickElementJs(ConstantsSender.selectNow);
    }
    public void selectEmail(){
        clickEmail();
        inputEmail();
    }
    public void inputSenderName(){
        sendKeysToElement(ConstantsSender.inpunSenderName,"Moshe");
    }
    public void btnToPay(){
        clickElement(ConstantsSender.btnToPay);
    }
    //-------pivert functions------
    private void clickFeildEvent(){
        clickElement(ConstantsSender.selectFeildEvent);

    }
    private void clickEvent(){
        clickElement(ConstantsSender.selectEvent);

    }
    private void clickEmail(){
        clickElement(ConstantsSender.selectEmail);
    }
    private void inputEmail(){
        sendKeysToElement(ConstantsSender.inpunEmail,"moshe@test.com");
    }

}
