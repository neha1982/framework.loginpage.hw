package com.nop.feature;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    By emailField = By.id("Email");
    By passField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
   // By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public void verifyUserIsOnLogInPage(){
        assertURL("login");
    }

    public void userEntersLoginDetails(String email,String password){
        enterElement(emailField,email);
        enterElement(passField,password);
        clickElementBy(loginBtn);
    }
//    public boolean verifyWelcomeText(String text) {
//        if (getTextFromElement(welcomeText, text).equals(text)) {
//            return true;
//        }else{
//
//            return  false;
//
//        }
//
//    }

}