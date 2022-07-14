package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AccountPage extends PageObject {

    private By userClickAccountMenu(){
        return By.xpath("");
    }

    private By userOnTheProfilePage(){
        return By.xpath("");
    }

    private By userClickServiceTerms() {
        return By.className("");
    }

    private By userOnTheServiceTermsPage() {
        return By.className("");
    }

    private By userClickPrivacyPolice() {
        return By.xpath("");
    }

    private By userOnThePrivacyPolicePage() {
        return By.xpath("");
    }

    private By userOnTheAccountPage() {
        return By.xpath("");
    }

    private By userClickEditProfile() {
        return By.xpath("");
    }

    private By userOnTheEditProfilePage() {
        return By.xpath("");
    }

    @Step
    public void ClickAccountMenu(){
        $(userClickAccountMenu()).click();
    }

    @Step
    public boolean OnTheProfilePage(){
        return $(userOnTheProfilePage()).isDisplayed();
    }

    @Step
    public void ClickServiceTerms(){
        $(userClickServiceTerms()).click();
    }

    @Step
    public boolean OnTheServiceTermsPage(){
        return $(userOnTheServiceTermsPage()).isDisplayed();
    }

    @Step
    public void ClickPrivacyPolice(){
        $(userClickPrivacyPolice()).click();
    }

    @Step
    public boolean OnThePrivacyPolicePage(){
        return $(userOnThePrivacyPolicePage()).isDisplayed();
    }

    @Step
    public boolean OnTheAccountPage(){
        return $(userOnTheAccountPage()).isDisplayed();
    }

    @Step
    public void ClickEditProfile(){
        $(userClickEditProfile()).click();
    }

    @Step
    public boolean OnTheEditProfilePage(){
        return $(userOnTheEditProfilePage()).isDisplayed();
    }
}
