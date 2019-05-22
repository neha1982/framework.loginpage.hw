package com.nop.feature;

import org.openqa.selenium.By;

public class RegistrationSuccessPage extends Utils{

    LoadProp loadProp=new LoadProp();
    By regitsterSuccessMessage=By.xpath("//div[@class=\"result\"]");

    public void verifyUserSeeRegistrationSuccessMessage(){
        clickElementBy(regitsterSuccessMessage);
    }

}
