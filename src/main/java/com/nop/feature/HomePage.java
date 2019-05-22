package com.nop.feature;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    By registerLink = By.className("ico-register");
    By computerLink = By.linkText("Computers");
    By apparelLink = By.linkText("Apparel");
    By digitalDownloadLink = By.linkText("Digital downloads");
    By booksLink = By.linkText("Books");

    /*@FindBy (linkText = "Register")
    WebElement _registerLink;
*/
    public void clickOnRegisterButton(){

        clickElementBy(registerLink);
    }
    public void clickOnCategoryLinks(String link)
    {
        clickElementBy(By.linkText(link));
    }
    public void userNavigateToBooks(){
        clickElementBy(booksLink);
    }
    public void searchForAnyProduct() {

    }

}
