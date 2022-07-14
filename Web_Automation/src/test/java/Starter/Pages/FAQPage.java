package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class FAQPage extends PageObject {

    private By userClickFAQMenu (){
        return By.xpath("(//p[@class='hover:font-bold transition-all'])[5]");
    }

    private By userClickOneOfTheFAQ (){
        return By.xpath("(//span[@class='justify-evenly'])[1]");
    }

    private By userOnTheDetailFAQPage (){
        return By.xpath("(//div[@class='w-full rounded-lg bg-white block px-4 py-4'])[1]");
    }

    @Step
    public void ClickFAQMenu(){
       $(userClickFAQMenu()).click();
    }

    @Step
    public void ClickOneOfTheFAQ(){
        $(userClickOneOfTheFAQ()).click();
    }

    @Step
    public boolean OnTheDetailFAQPage(){
        return $(userOnTheDetailFAQPage()).isDisplayed();
    }


}
