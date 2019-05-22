package com.nop.feature;

import org.openqa.selenium.By;

import java.util.Random;

public class RegistrationPage extends Utils {
    LoadProp loadProp=new LoadProp();
    //   By registerLink = By.xpath("//a[@class='ico-register']");
    By femaleGender = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayDOB = By.name("DateOfBirthDay");
    By monthDOB = By.name("DateOfBirthMonth");
    By yearDOB = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By password = By.name("Password");
    By confirmPassword = By.name("ConfirmPassword");
    By company = By.id("Company");
    By newsLetter = By.id("Newsletter");
    By registerBtn = By.id("register-button");
    // By registerText = By.xpath("//h1[contains(text(),'Register')]");
    // By registrationSuccessfulText = By.xpath("//div[@class='result']");


    private static String timetemp = getCurrentTimeStamp();

    public void verifyUserIsOnRegisterPage() {
        assertURL("https://demo.nopcommerce.com/register");
    }

    public void userEnterRegistrationDetails()  {
        clickElementBy(femaleGender);
        String FirstName = LoadProp.getProperty("FirstName");
        enterText(firstName, LoadProp.getProperty("FirstName"));
        enterText(lastName, LoadProp.getProperty("LastName"));
//        selectDropDownValue(dayDOB, LoadProp.getProperty("Day"));
//        Thread.sleep(3000);
//        selectDropDownValue(monthDOB, LoadProp.getProperty("Month"));
//        Thread.sleep(3000);
//        selectDropDownValue(yearDOB, LoadProp.getProperty("Year"));
//        Thread.sleep(3000);
        Random randomGenerator = new Random();
        int randomint = randomGenerator.nextInt(1000);
        enterText(email, LoadProp.getProperty("email"));
        enterText(company, LoadProp.getProperty("Company"));
        clickElementBy(newsLetter);
        enterText(password, LoadProp.getProperty("password"));
        enterText(confirmPassword, LoadProp.getProperty("confirmpassword"));
        clickElementBy(registerBtn);
    }
}
