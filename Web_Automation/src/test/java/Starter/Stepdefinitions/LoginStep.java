package Starter.Stepdefinitions;

import Starter.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStep {

    @Steps
    LoginPage LP;


//TCLP1
    @Given("user on the login page")
    public void userOnTheLoginPage() {
        LP.openpageLogin();
        LP.OnTheLoginPage();
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        LP.InputValidEmail("");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        LP.InputValidPassword("");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        LP.ClickLoginButton();
    }

    @Then("user succes login")
    public void userSuccesLogin() {
        LP.SuccesLogin();
    }

//TCLN2

    @When("User input invalid email")
    public void userInputInvalidEmail() {
        LP.InputInvalidEmail("");
    }

    @Then("User can't login")
    public void userCanTLogin() {
        LP.CanTLogin();
    }

//TCLN3
    @And("User input invalid password")
    public void userInputInvalidPassword() {
        LP.InputInvalidPassword("");
    }
}
