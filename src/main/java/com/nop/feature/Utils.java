package com.nop.feature;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    //1
    public static void clickElementBy(By by) {
        driver.findElement(by).click();
    }

    //2
    //for firstname,lastname,email, password nd conform password
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys("text");
    }

    //3 for Dob Date Month Year Select by value (it is attribute inside the inspact)
    // like value=2 is a February month, date value = 2 so date 2nd.

    public static void selectTextByValue(By by, String text) {
        org.openqa.selenium.support.ui.
                Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    //23 Get current system time
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");// dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }
    //25 Method for getting text from web(so getting text from assertTextMessage method)
    public static String  getTextFromElement(By by,String text)
    {
        return driver.findElement(by).getText();
    }
    //26.  if URL contain specific word
    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }
    //  27
    public static void sendText(By by,String text)

    {
        driver.findElement(by).sendKeys(text);
    }
    //28
    public void takeScreenShotofBrowser(String destination_folder) throws IOException {
        File source_folder = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source_folder, new File(destination_folder));
    }


    //29 only hover to element mouse hover method(mouseOverHover)
    public void hoverElement(By by){
        //xpath store in ele or you can use direct
        WebElement ele = driver.findElement(by);
        Actions act = new Actions(driver);
        //single element perform if multiple we use build.perform
        act.moveToElement(ele).perform();
    }
    //30 select dropdown name or value
    public void dropDown(By by,String data){
        Select dob = new Select(driver.findElement(by));
        dob.selectByValue(data);
    }
    //31
    public void selectDropDownValue(By by,String text){
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByValue("");
    }
    //32
    public void selectDropDownIndex(By by, int index){
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByIndex(index);
    }



}
