package Registration;

import WebSettings.BasePage;


public class LocatorsPage extends BasePage {


    public void regBtn(){
        clickElement(ConstantsReg.signedBtn);
    }
    public void logRegBtn(){
        clickElement(ConstantsReg.logRegBtn);
    }
    public void fieldsReg(){
        sendKeysToElement(ConstantsReg.fieldName,"Moshe");
        sendKeysToElement(ConstantsReg.fieldEmail,"moshetest@test7.com");
        sendKeysToElement(ConstantsReg.fieldPassword,"Test1234");
        sendKeysToElement(ConstantsReg.fieldConfirmPassword,"Test1234");
    }
    public void selectConfirm(){
        clickElement(ConstantsReg.selectConfirm);
    }
    public void submitRegBtn(){
        clickElement(ConstantsReg.submitRegBtn);
    }
}
