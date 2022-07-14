package Starter.Stepdefinitions;

import Starter.Pages.PoinPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PoinStep {

    @Steps
    PoinPage Ppage;

//TCP1
    @Given("user on the point page")
    public void userOnThePointPage() {
        Ppage.openpagepoin();
        Ppage.OnThePointPage();
    }

    @When("user click all on pulse")
    public void userClickAllOnPulse() {
        Ppage.ClickAllOnPulse();
    }

    @And("user click one pulse exchange options")
    public void userClickOnePulseExchangeOptions() {
        Ppage.ClickOnePulseExchangeOptions();
    }

    @And("user on the details option page")
    public void userOnTheDetailsOptionPage() {
        Ppage.TheDetailsOptionPage();
    }

    @And("user click button point exchange confirmation")
    public void userClickButtonPointExchangeConfirmation() {
        Ppage.ClickButtonPointExchangeConfirmation();
    }

    @And("user on the form exchange page")
    public void userOnTheFormExchangePage() {
        Ppage.OnTheFormExchangePage();
    }

    @And("user input phone number")
    public void userInputPhoneNumber() {
        Ppage.InputPhoneNumber("");
    }

    @And("user choose provider")
    public void userChooseProvider() {
        Ppage.ChooseProvider();
    }

    @And("user click button submit")
    public void userClickButtonSubmit() {
        Ppage.ClickButtonSubmit();
    }

    @Then("User on the successful page")
    public void userOnTheSuccessfulPage() {
        Ppage.OnTheSuccessfulPage();
    }

//TCP2
    @When("user click  all in the data plan")
    public void userClickAllInTheDataPlan() {
        Ppage.ClickAllInTheDataPlan();
    }

    @And("user click one data plan exchange options")
    public void userClickOneDataPlanExchangeOptions() {
        Ppage.ClickOneDataPlanExchangeOptions();
    }

//TCP3
    @When("user click all on E-money")
    public void userClickAllOnEMoney() {
        Ppage.ClickAllOnEMoney();
    }

    @And("user choose electronic money options")
    public void userChooseElectronicMoneyOptions() {
        Ppage.ChooseElectronicMoneyOptions();
    }

//TCP4
    @When("user  click all in Castout")
    public void userClickAllInCastout() {
        Ppage.ClickAllInCastout();
    }

    @And("user click one castout exchange options")
    public void userClickOneCastoutExchangeOptions() {
        Ppage.ClickOneCastoutExchangeOptions();
    }

    @And("user on the details castout option page")
    public void userOnTheDetailsCastoutOptionPage() {
        Ppage.OnTheDetailsCastoutOptionPage();
    }

    @And("user input account number")
    public void userInputAccountNumber() {
        Ppage.InputAccountNumber("");
    }

    @And("user choose bank options")
    public void userChooseBankOptions() {
        Ppage.ChooseBankOptions();
    }

//TCP5
    @When("user click check point exchange benefits menu")
    public void userClickCheckPointExchangeBenefitsMenu() {
        Ppage.ClickCheckPointExchangeBenefitsMenu();
    }

    @Then("user on the details benefit page")
    public void userOnTheDetailsBenefitPage() {
        Ppage.OnTheDetailsBenefitPage();
    }

}
