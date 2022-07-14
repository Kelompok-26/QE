package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PoinPage extends PageObject {

    private By userOnThePointPage(){
        return By.xpath("");
    }
    private By userClickAllOnPulse(){
        return By.xpath("");
    }
    private By userClickOnePulseExchangeOptions() {
        return By.className("");
    }
    private By userOnTheDetailsOptionPage() {
        return By.className("");
    }
    private By userClickButtonPointExchangeConfirmation() {
        return By.xpath("");
    }
    private By userOnTheFormExchangePage() {
        return By.xpath("");
    }
    private By userInputPhoneNumber() {
        return By.xpath("");
    }
    private By userChooseProvider() {
        return By.xpath("");
    }
    private By userClickButtonSubmit() {
        return By.xpath("");
    }
    private By userOnTheSuccessfulPage() {
        return By.xpath("");
    }
    private By userClickAllInTheDataPlan() {
        return By.xpath("");
    }
    private By userClickOneDataPlanExchangeOptions() {
        return By.xpath("");
    }
    private By userClickAllOnEMoney() {
        return By.xpath("");
    }
    private By userChooseElectronicMoneyOptions() {
        return By.xpath("");
    }
    private By userClickAllInCastout() {
        return By.xpath("");
    }
    private By userClickOneCastoutExchangeOptions() {
        return By.xpath("");
    }
    private By userOnTheDetailsCastoutOptionPage() {
        return By.xpath("");
    }
    private By userInputAccountNumber() {
        return By.xpath("");
    }
    private By userChooseBankOptions() {
        return By.xpath("");
    }
    private By userClickCheckPointExchangeBenefitsMenu() {
        return By.xpath("");
    }
    private By userOnTheDetailsBenefitPage() {
        return By.xpath("");
    }

    @Step
    public void openpagepoin(){
        open();
    }
    @Step
    public boolean OnThePointPage(){
        return $( userOnThePointPage()).isDisplayed();
    }
    @Step
    public void ClickAllOnPulse(){
        $(userClickAllOnPulse()).click();
    }
    @Step
    public void ClickOnePulseExchangeOptions(){
       $(userClickOnePulseExchangeOptions()).click();
    }
    @Step
    public boolean TheDetailsOptionPage(){
        return $(userOnTheDetailsOptionPage()).isDisplayed();
    }
    @Step
    public void ClickButtonPointExchangeConfirmation(){
        $(userClickButtonPointExchangeConfirmation()).click();
    }
    @Step
    public boolean OnTheFormExchangePage(){
        return $(userOnTheFormExchangePage()).isDisplayed();
    }
    @Step
    public void InputPhoneNumber(String NoHP){
        $(userInputPhoneNumber()).type(NoHP);
    }
    @Step
    public void ChooseProvider(){
        $(userChooseProvider()).select();
    }
    @Step
    public void ClickButtonSubmit(){
        $(userClickButtonSubmit()).click();
    }
    @Step
    public boolean OnTheSuccessfulPage(){
        return $(userOnTheSuccessfulPage()).isDisplayed();
    }
    @Step
    public void ClickAllInTheDataPlan(){
        $(userClickAllInTheDataPlan()).click();
    }
    @Step
    public void ClickOneDataPlanExchangeOptions(){
        $(userClickOneDataPlanExchangeOptions()).click();
    }
    @Step
    public void ClickAllOnEMoney(){
        $(userClickAllOnEMoney()).click();
    }
    @Step
    public void ChooseElectronicMoneyOptions(){
        $(userChooseElectronicMoneyOptions()).select();
    }
    @Step
    public void ClickAllInCastout(){
        $(userClickAllInCastout()).click();
    }
    @Step
    public void ClickOneCastoutExchangeOptions(){
        $(userClickOneCastoutExchangeOptions()).click();
    }
    @Step
    public boolean OnTheDetailsCastoutOptionPage(){
        return $(userOnTheDetailsCastoutOptionPage()).isDisplayed();
    }
    @Step
    public void InputAccountNumber(String NoRek){
        $(userInputAccountNumber()).type(NoRek);
    }
    @Step
    public void ChooseBankOptions(){
        $(userChooseBankOptions()).select();
    }
    @Step
    public void ClickCheckPointExchangeBenefitsMenu(){
        $(userClickCheckPointExchangeBenefitsMenu()).click();
    }
    @Step
    public boolean OnTheDetailsBenefitPage(){
        return $(userOnTheDetailsBenefitPage()).isDisplayed();
    }
}
