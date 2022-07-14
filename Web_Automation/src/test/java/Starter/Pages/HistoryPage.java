package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HistoryPage extends PageObject {


    private By userclikhistorymenu(){
        return By.xpath("(//p[@class='hover:font-bold transition-all'])[2]");
    }

    private By userclickbuttontransctionmenu(){
        return By.xpath("(//button [@class='inline-block bg-white-100 border-2 w-72 border-[#EE6F57] px-4 py-4 gap-3 rounded-md bg-[#EE6F57]'])");
    }

    private By useronthetransctionpage() {
        return By.className("text-[46px] font-semibold");
    }

    private By userClickMenuPoint() {
        return By.className("inline-block w-72 px-4 py-4 gap-2 rounded-md border-2 border-[#EE6F57]");
    }

    private By userOnThePointsHistoryPage() {
        return By.xpath("(//div[@class='w-full aspect-[8.06/1] bg-white border-b-[1px] border-black px-5 py-6'])[1]");
    }


    @Step
    public void userclikhistory(){
        $(userclikhistorymenu()).click();
    }

    @Step
    public void clicktransction(){
        $(userclickbuttontransctionmenu()).click();
    }

    @Step
    public boolean onthetransctionpage(){
        return $(useronthetransctionpage()).isDisplayed();
    }

    @Step
    public void ClickMenuPoint(){
        $(userClickMenuPoint()).click();
    }

    @Step
    public boolean OnThePointsHistoryPage(){
        return $(userOnThePointsHistoryPage()).isDisplayed();
    }


}
