package pl.olx;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends AbstractPage{
    final Integer shortWaitTime = 5;
    final Integer longWaitTime = 30;

    public SelenideElement categoryMotoryzacja = $x("//span[text()='Motoryzacja']");
    public SelenideElement subCategorySamochodyOsobowe = $("Samochody osobowe");
    public SelenideElement marka = $x("//span[@data-default-label='Marka']");
    public SelenideElement model = $x("//li//div//a//span[@data-default-label='Model']");

    public void selectBrandCar(String brandCar){
        click(marka, longWaitTime);
        SelenideElement b = $(By.xpath("//a[@data-code='" + brandCar + "']"));
        click(b, shortWaitTime);
    }
    public void selectModelCar(String modelCar){
        click(model, longWaitTime);
        SelenideElement m = $(By.xpath("//input[@type='checkbox' and @data-value='" + modelCar + "']"));
        click(m, shortWaitTime);
    }
}
