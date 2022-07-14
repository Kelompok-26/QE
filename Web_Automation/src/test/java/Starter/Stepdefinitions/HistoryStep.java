package Starter.Stepdefinitions;

import Starter.Pages.HistoryPage;
import Starter.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HistoryStep {

    @Steps
    HistoryPage Hpage;

    @Steps
    HomePage homepg;



//TCH1
    @Given("user on the home page")
    public void userOnTheHomePage() {
        homepg.openpage();
        homepg.onthehomepage();
    }

    @When("user click history menu")
    public void userClickHistoryMenu() {
        Hpage.userclikhistory();
    }

    @And("user click button transaction")
    public void userClickbuttonTransaction() {
        Hpage.clicktransction();
    }

    @Then("user  on the transaction page")
    public void userOnTheDetailTransactionPage() {
        Hpage.onthetransctionpage();
    }

//THC2
    @And("user click menu point")
    public void userClickMenuPoint() {
        Hpage.ClickMenuPoint();
    }

    @Then("User on the points history page")
    public void userOnThePointsHistoryPage() {
        Hpage.OnThePointsHistoryPage();
    }

}
