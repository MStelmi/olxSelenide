package pl.olx;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends AbstractPage{

    private SelenideElement categoryMotoryzacja = $x("//span[text()='Motoryzacja']");
    private SelenideElement subCategorySamochodyOsobowe = $(By.linkText("Samochody osobowe"));

    public CarPage navigateToSamochodyOsobowe(){
        categoryMotoryzacja.click();
        subCategorySamochodyOsobowe.click();
        return new CarPage();
    }
}
