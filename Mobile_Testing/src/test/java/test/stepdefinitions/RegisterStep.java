package test.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {

//Negative
    @When("User click daftar")
    public void userClickDaftar() {
    }

    @And("User input registered email")
    public void userInputRegisteredEmail() {
    }

    @And("user input registered phone number")
    public void userInputRegisteredPhoneNumber() {
    }

    @And("User input registered username")
    public void userInputRegisteredUsername() {
    }

    @And("user input gender")
    public void userInputGender() {
    }

    @And("user input registerd account number")
    public void userInputRegisterdAccountNumber() {
    }

    @And("User input registered date of birth")
    public void userInputRegisteredDateOfBirth() {
    }

    @And("User input registered password")
    public void userInputRegisteredPassword() {
    }

    @And("user click sign up button")
    public void userClickSignUpButton() {
    }

    @Then("user can't registered")
    public void userCanTRegistered() {
    }

//Positive
    @And("User input valid email")
    public void userInputValidEmail() {
    }

    @And("User input valid phone number")
    public void userInputValidPhoneNumber() {
    }

    @And("User input valid username")
    public void userInputValidUsername() {
    }

    @And("user input valid account number")
    public void userInputValidAccountNumber() {
    }

    @And("User input valid date of birth")
    public void userInputValidDateOfBirth() {
    }

    @And("User input valid password")
    public void userInputValidPassword() {
    }

    @Then("user succes registered")
    public void userSuccesRegistered() {
    }
}
