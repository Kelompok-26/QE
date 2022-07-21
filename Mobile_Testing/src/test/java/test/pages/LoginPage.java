package test.pages;

import Test.PageObject.BasePageObject;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

    private By userOnTheLoginPage(){
        return MobileBy.xpath("");
    }
    private By userInputValidEmail(){
        return MobileBy.xpath("");
    }

    private By userInputValidPassword(){
        return MobileBy.xpath("");
    }

    private By userClickLoginButton(){
        return MobileBy.xpath("");
    }

    private By userSuccesLogin(){
        return MobileBy.xpath("");
    }

    private By userInputUnregisteredEmail(){
        return MobileBy.xpath("");
    }

    private By userCanTLogin(){
        return MobileBy.xpath("");
    }
    private By userInputWrongPassword(){
        return MobileBy.xpath( "");
    }


    @Step
    public boolean OnTheLoginPage(){
        return waitUntilVisible(userOnTheLoginPage()).isDisplayed();
    }

    @Step
    public void InputValidEmail(String Email){
        onClick(userInputValidEmail());
        onType(userInputValidEmail(),Email);
    }

    @Step
    public void InputValidPassword(String Password){
        onClick(userInputValidPassword());
        onType(userInputValidPassword(),Password);
    }

    @Step
    public void ClickLoginButton(){
        onClick(userClickLoginButton());
    }

    @Step
    public boolean SuccesLogin(){
        return waitUntilVisible(userSuccesLogin()).isDisplayed();
    }

    @Step
    public void InputUnregisteredEmail(String email){
        onClick(userInputUnregisteredEmail());
        onType(userInputUnregisteredEmail(),email);
    }

    @Step
    public boolean CanTLogin(){
        return waitUntilVisible(userCanTLogin()).isDisplayed();
    }

    @Step
    public void InputWrongPassword(String Password){
        onClick(userInputWrongPassword());
        onType(userInputWrongPassword(),Password);
    }

}
