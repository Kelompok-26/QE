package Starter.Stepdefinitions;

import Starter.Pages.RegisterdPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterdStep {

    @Steps
    RegisterdPage Rpage;

//TCRP1
    @Given("user on the register page")
    public void userOnTheRegisterPage() {
        Rpage.openpageReg();
        Rpage.OnTheRegisterPage();
    }

    @When("User input valid email")
    public void userInputValidEmail() {
        Rpage.InputValidEmailReg("");
    }

    @And("User input username")
    public void userInputUsername() {
        Rpage.InputUsername("");
    }

    @And("User input valid phone number")
    public void userInputValidPhoneNumber() {
        Rpage.InputValidRegPhoneNumber("");
    }

    @And("user input valid account number")
    public void userInputValidAccountNumber() {
        Rpage.InputValidAccountNumber("");
    }

    @And("User input date of birth")
    public void userInputDateOfBirth() {
        Rpage.InputDateOfBirth("");
    }

    @And("User input password")
    public void userInputPassword() {
        Rpage.InputPasswordRg("");
    }

    @And("user click sign up button")
    public void userClickSignUpButton() {
        Rpage.ClickSignUpButton();
    }

    @Then("user succes register")
    public void userSuccesRegister() {
        Rpage.SuccesRegister();
    }

//TCRN2
    @When("User input registerd email")
    public void userInputRegisterdEmail() {
        Rpage.InputRegisterdEmail("");
    }

    @And("User input registered username")
    public void userInputRegisteredUsername() {
        Rpage.InputRegisteredUsername("");
    }

    @And("User input registered phone number")
    public void userInputRegisteredPhoneNumber() {
        Rpage.InputRegisteredPhoneNumber("");
    }

    @And("user input registered account number")
    public void userInputRegisteredAccountNumber() {
        Rpage.InputRegisteredAccountNumber("");
    }

    @And("User input registered date of birth")
    public void userInputRegisteredDateOfBirth() {
        Rpage.InputRegisteredDateOfBirth("");
    }

    @And("User input registered password")
    public void userInputRegisteredPassword() {
        Rpage.InputRegisteredPassword("");
    }

    @Then("user notsuccesful register")
    public void userNotsuccesfulRegister() {
        Rpage.NotsuccesfulRegister();
    }
}
