package Starter.Stepdefinitions;

import Starter.Pages.FAQPage;
import Starter.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FAQStep {

    @Steps
    HomePage Home;

    @Steps
    FAQPage fpage;


    @Given("user on the home page1")
    public void userOnTheHomePage1() {
        Home.openpage();
        Home.onthehomepage();
    }

    @When("user click FAQ menu")
    public void userClickFAQMenu() {
        fpage.ClickFAQMenu();
    }

    @And("user click one of the FAQ")
    public void userClickOneOfTheFAQ() {
        fpage.ClickOneOfTheFAQ();
    }

    @Then("user on the detail FAQ page")
    public void userOnTheDetailFAQPage() {
        fpage.OnTheDetailFAQPage();
    }
}
