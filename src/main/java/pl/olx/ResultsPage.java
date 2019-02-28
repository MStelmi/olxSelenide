package pl.olx;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultsPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//table[@summary='Ogłoszenia']")
    public SelenideElement results;

    public boolean verifyResults(String result){
        results.shouldBe(Condition.visible);
        String resultText = results.getText().toLowerCase();
        System.out.println(resultText);
        return resultText.contains(result);
    }
}
