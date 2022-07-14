package Starter.Stepdefinitions;

import Starter.Pages.AccountPage;
import Starter.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AccountStep {

    @Steps
    HomePage Hpg;

    @Steps
    AccountPage Acp;

//TCAC1
    @Given("user on the home page3")
    public void userOnTheHomePage3() {
        Hpg.openpage();
        Hpg.onthehomepage();
    }

    @When("user click account menu")
    public void userClickAccountMenu() {
        Acp.ClickAccountMenu();
    }

    @Then("user on the profile page")
    public void userOnTheProfilePage() {
        Acp.OnTheProfilePage();
    }

//TCAC2
    @And("user click service terms")
    public void userClickServiceTerms() {
        Acp.ClickServiceTerms();
    }

    @Then("user  on the service terms page")
    public void userOnTheServiceTermsPage() {
        Acp.OnTheServiceTermsPage();
    }

//TCAC3

    @And("user click privacy police")
    public void userClickPrivacyPolice() {
        Acp.ClickPrivacyPolice();
    }

    @Then("user  on the privacy police page")
    public void userOnThePrivacyPolicePage() {
        Acp.OnThePrivacyPolicePage();
    }

//TCAC4
    @Given("user on the account  page")
    public void userOnTheAccountPage() {
        Acp.OnTheAccountPage();
    }

    @When("user click edit profile")
    public void userClickEditProfile() {
        Acp.ClickEditProfile();
    }

    @Then("user  on the edit profile page")
    public void userOnTheEditProfilePage() {
        Acp.OnTheEditProfilePage();
    }
}
