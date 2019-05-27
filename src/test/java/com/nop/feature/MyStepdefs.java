package com.nop.feature;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage=new RegistrationSuccessPage();


    @Given("^user is on register page$")
    public void userIsOnRegisterPage()
    {
        homePage.clickOnRegisterButton();
    }

    @When("^user enters all registration details$")
    public void userEntersAllRegistrationDetails() {
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
    }
    @Then("^user should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully() {
        registrationSuccessPage.verifyUserSeeRegistrationSuccessMessage();
    }


    @Given("^user is on home page$")
    public void userIsOnHomePage() {
        homePage.clickOnCategoryLinks("Apparel");

    }

    @When("^user click on apparel$")
    public void userClickOnApparel() {



    }

    @And("^user select clothing$")
    public void userSelectClothing() {

    }

    @Then("^user click on change currency$")
    public void userClickOnChangeCurrency() {

    }
    @Then("^All product should show in Dollar value$")
    public void allProductShouldShowInDollarValue() {
        currencyChange.priceCurrency();

    }

    @When("^user clicks on \"([^\"]*)\" link from top menu$")
    public void userClicksOnLinkFromTopMenu(String link) throws Throwable {
        homePage.clickOnCategoryLinks(link);

    }

    @Then("^user should able to navigate to \"([^\"]*)\" successfully$")
    public void userShouldAbleToNavigateToSuccessfully(String link) {
        Utils.assertCurrentURL(link);
    }

    @Given("^user is on login page$")
    public void userIsOnLoginPage() {
        homePage.clickOnLoginLink();
    }
    @When("^user enters invalid \"([^\"]*)\" or \"([^\"]*)\"$")
    public void userEntersInvalidOr(String email, String password) throws Throwable {
        loginPage.userEntersLoginDetails(email, password);

    }
    @Then("^user should able to see the \"([^\"]*)\"$")
    public void userShouldAbleToSeeThe(String errormessage) throws Throwable {
        boolean b;
        if (errormessage.contains("No customer account found")|| errormessage.contains("The credential provided are incorrect"))
        {
            b=true;
        }
        else
        {
            b = false;
        }
        Assert.assertTrue(b);


    }



}
