package test.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.pages.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginpage;

//Positive
    @Given("user on the login page")
    public void userOnTheLoginPage() {
        boolean actual = loginpage.OnTheLoginPage();
        Assert.assertTrue(actual);
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        loginpage.InputValidEmail("");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginpage.InputValidPassword("");

    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginpage.ClickLoginButton();
    }

    @Then("user succes login")
    public void userSuccesLogin() {
        boolean actual = loginpage.SuccesLogin();
        Assert.assertTrue(actual);
    }

//Negative1
    @When("User input unregistered email")
    public void userInputUnregisteredEmail() {
        loginpage.InputUnregisteredEmail("");
    }

    @Then("User can't login")
    public void userCanTLogin() {
        boolean actual = loginpage.CanTLogin();
        Assert.assertTrue(actual);

    }

//Negative2
    @And("user input wrong password")
    public void userInputWrongPassword() {
        loginpage.InputWrongPassword("");
    }

}
