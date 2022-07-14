package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ReedemPage extends PageObject {

    private By userOnTheReedemPage(){
        return By.xpath("");
    }
    private By userInputName(){
        return By.xpath("");
    }
    private By userChooseTheTypeOfCashOut(){
        return By.xpath("");
    }
    private By userInputNominalCashOut(){
        return By.xpath("");
    }
    private By userClickButtonSubmitReedem(){
        return By.xpath("");
    }
    private By userOnTheProcessPage(){
        return By.xpath("");
    }
    private By userChooseTheTypeOfEMoney(){
        return By.xpath("");
    }
    private By userInputNominalEMoney(){
        return By.xpath("");
    }
    private By userChooseTheTypeOfCashout(){
        return By.xpath("");
    }

    @Step
    public void openpageredeem(){
        open();
    }

    @Step
    public boolean OnTheReedemPage(){
        return $(userOnTheReedemPage()).isDisplayed();
    }
    @Step
    public void InputName(String Name){
        $(userInputName()).type(Name);
    }
    @Step
    public void ChooseTheTypeOfCashOut(){
        $(userChooseTheTypeOfCashOut()).select();
    }
    @Step
    public void InputNominalCashOut(String NominalCashOut){
        $(userInputNominalCashOut()).type(NominalCashOut);
    }
    @Step
    public void ClickButtonSubmitReedem(){
        $(userClickButtonSubmitReedem()).click();
    }
    @Step
    public boolean OnTheProcessPage(){
        return $(userOnTheProcessPage()).isDisplayed();
    }
    @Step
    public void ChooseTheTypeOfEMoney(){
        $(userChooseTheTypeOfEMoney()).select();
    }
    @Step
    public void InputNominalEMoney(String NominalEMoney){
        $(userInputNominalEMoney()).type(NominalEMoney);
    }
    @Step
    public void ChooseTheTypeOfCashout(){
        $(userChooseTheTypeOfCashout()).select();
    }
    
}
