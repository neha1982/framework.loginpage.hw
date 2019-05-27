package com.nop.feature;

import org.openqa.selenium.By;

public class ProductPage extends Utils {
    LoadProp loadProp=new LoadProp();
    By apparel = By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[3]/a");
    By clothing = By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[2]/a");
    By Currency = By.xpath("//*[@id=\'customerCurrency\']");

    /* Given user is on the home page
    When user hover on Apparels
    And user click on clothing
    And user click on change currency
    Then All product should show in Dollar value
     */

    public void userHoverOnApparels(){

        //code to perform hovering
        mouseOver(apparel);
    }
    public void userClickOnClothing(){
        //click on clothing
        clickElementBy(clothing);
    }
    public  void userClickOnChangeCurrency(){
        //click on currency
        clickElementBy(Currency);

        //click on Euro
        selectTextByValue(Currency, "Euro");

        //click on Sort Currency
        clickElementBy(Currency);

        //click on USD
        selectTextByValue(Currency,"US Dollar");

    }

}
