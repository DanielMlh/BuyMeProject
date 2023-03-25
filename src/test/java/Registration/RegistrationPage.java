package Registration;

import WebSettings.BasePage;


public class RegistrationPage extends BasePage {


    public void regBtn(){
        clickElement(LocatorsReg.signedBtn);
    }
    public void logRegBtn(){
        clickElement(LocatorsReg.logRegBtn);
    }
    public void fieldsReg(){
        sendKeysToElement(LocatorsReg.fieldName,"Moshe");
        sendKeysToElement(LocatorsReg.fieldEmail,"moshetest@test7.com");
        sendKeysToElement(LocatorsReg.fieldPassword,"Test1234");
        sendKeysToElement(LocatorsReg.fieldConfirmPassword,"Test1234");
    }
    public void selectConfirm(){
        clickElement(LocatorsReg.selectConfirm);
    }
    public void submitRegBtn(){
        clickElement(LocatorsReg.submitRegBtn);
    }
}
