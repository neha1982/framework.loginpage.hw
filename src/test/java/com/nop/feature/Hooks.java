package com.nop.feature;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {
    BrowserSelector browserSelector=new BrowserSelector();
    //static String timeStamp =new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());

    @Before
    public void setUpBrowser() {
        browserSelector.SetUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }
    @After
    p@After
    public void closeBrowser(Scenario scenario)throws Exception{
        if (scenario.isFailed()){
            try {
                TakesScreenshot ts =(TakesScreenshot)driver;

                File source = ts.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(source,new File("Screenshot\\"+ scenario.getName()+".png"));

                System.out.println("Screenshot taken");
            }
            catch (Exception e){
                System.out.println("Exception while takin screenshot"+e.getMessage());
            }
            driver.quit();
        }
//        try {
//            if (scenario.isFailed()){
//                final File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(screenshot,new File("FailedTestCase\\"+ System.currentTimeMillis()+".png"));
//            }
//        }catch (WebDriverException somePlatformsDontSupportScreenshots){
//            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
//        }
        driver.quit();


    }
}

