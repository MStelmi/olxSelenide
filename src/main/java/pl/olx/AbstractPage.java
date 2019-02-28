package pl.olx;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class AbstractPage {

    public void waitForElement(SelenideElement e, Integer time){
        e.waitUntil(Condition.visible, time);
    }
    public void click(SelenideElement e, Integer time){
        waitForElement(e, time);
        e.click();
    }
}
