package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By userOnTheLoginPage(){
        return By.xpath("");
    }

    private By userInputValidEmail(){
        return By.xpath("");
    }

    private By userInputValidPassword() {
        return By.className("");
    }

    private By userClickLoginButton() {
        return By.className("");
    }

    private By userSuccesLogin() {
        return By.xpath("");
    }

    private By userInputInvalidEmail() {
        return By.xpath("");
    }

    private By userCanTLogin() {
        return By.xpath("");
    }

    private By userInputInvalidPassword() {
        return By.xpath("");
    }

    @Step
    public void openpageLogin(){
        open();
    }

    @Step
    public boolean OnTheLoginPage(){
        return $(userOnTheLoginPage()).isDisplayed();
    }
    @Step
    public void InputValidEmail(String Email){
        $(userInputValidEmail()).type(Email);
    }
    @Step
    public void InputValidPassword(String Password){
        $(userInputValidPassword()).type(Password);
    }
    @Step
    public void ClickLoginButton(){
        $(userClickLoginButton()).click();
    }
    @Step
    public boolean SuccesLogin(){
        return $(userSuccesLogin()).isDisplayed();
    }

    @Step
    public void InputInvalidEmail(String InvalidEmail){
        $(userInputInvalidEmail()).type(InvalidEmail);
    }
    @Step
    public boolean CanTLogin(){
        return $(userCanTLogin()).isDisplayed();
    }
    @Step
    public void InputInvalidPassword(String InvalidPassword){
        $(userInputInvalidPassword()).type(InvalidPassword);
    }
}
