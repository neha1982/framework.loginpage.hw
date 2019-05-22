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



}
