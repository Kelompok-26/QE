package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By useronthehomepage(){
        return By.xpath("(//div [@id='__nuxt'])");
    }

    @Step
    public void openpage(){
        open();
    }

    @Step
    public boolean onthehomepage(){
        return $(useronthehomepage()).isDisplayed();
    }
}
