package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterdPage extends PageObject {

    private By userOnTheRegisterPage(){
        return By.xpath("");
    }
    private By userInputValidEmail(){
        return By.xpath("");
    }
    private By userInputUsername(){
        return By.xpath("");
    }
    private By userInputValidPhoneNumber(){
        return By.xpath("");
    }
    private By userInputValidAccountNumber(){
        return By.xpath("");
    }
    private By userInputDateOfBirth(){
        return By.xpath("");
    }
    private By userInputPassword(){
        return By.xpath("");
    }
    private By userClickSignUpButton(){
        return By.xpath("");
    }
    private By userSuccesRegister(){
        return By.xpath("");
    }
    private By userInputRegisterdEmail(){
        return By.xpath("");
    }
    private By userInputRegisteredUsername(){
        return By.xpath("");
    }
    private By userInputRegisteredPhoneNumber(){
        return By.xpath("");
    }
    private By userInputRegisteredAccountNumber(){
        return By.xpath("");
    }
    private By userInputRegisteredDateOfBirth(){
        return By.xpath("");
    }
    private By userInputRegisteredPassword() { return By.xpath("");}
    private By userNotsuccesfulRegister(){
        return By.xpath("");
    }

    @Step
    public void openpageReg(){
        open();
    }
    @Step
    public boolean OnTheRegisterPage(){
        return $(userOnTheRegisterPage()).isDisplayed();
    }
    @Step
    public void InputValidEmailReg(String ValidEmail){
        $(userInputValidEmail()).type(ValidEmail);
    }
    @Step
    public void InputUsername(String username){
        $(userInputUsername()).type(username);
    }
    @Step
    public void InputValidRegPhoneNumber(String RegPhoneNumber){
        $(userInputValidPhoneNumber()).type(RegPhoneNumber);
    }
    @Step
    public void InputValidAccountNumber(String AccountNumber){
        $(userInputValidAccountNumber()).type(AccountNumber);
    }
    @Step
    public void InputDateOfBirth(String DateOfBirth){
        $(userInputDateOfBirth()).type(DateOfBirth);
    }
    @Step
    public void InputPasswordRg(String PasswordRg){
        $(userInputPassword()).type(PasswordRg);
    }
    @Step
    public void ClickSignUpButton(){
        $(userClickSignUpButton()).click();
    }
    @Step
    public boolean SuccesRegister(){
        return $(userSuccesRegister()).isDisplayed();
    }
    @Step
    public void InputRegisterdEmail(String RegisterdEmail){
        $(userInputRegisterdEmail()).type(RegisterdEmail);
    }
    @Step
    public void InputRegisteredUsername(String RegisteredUsername){
        $(userInputRegisteredUsername()).type(RegisteredUsername);
    }
    @Step
    public void InputRegisteredPhoneNumber(String RegisteredPhoneNumber){
       $(userInputRegisteredPhoneNumber()).type(RegisteredPhoneNumber);
    }
    @Step
    public void InputRegisteredAccountNumber(String RegisteredAccountNumber){
        $(userInputRegisteredAccountNumber()).type(RegisteredAccountNumber);
    }
    @Step
    public void InputRegisteredDateOfBirth(String RegisteredDateOfBirth){
        $(userInputRegisteredDateOfBirth()).type(RegisteredDateOfBirth);
    }
    @Step
    public void InputRegisteredPassword(String RegisteredPassword){
        $(userInputRegisteredPassword()).type(RegisteredPassword);
    }
    @Step
    public boolean NotsuccesfulRegister(){
        return $(userNotsuccesfulRegister()).isDisplayed();
    }
}
