package pl.olx;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CarPage extends AbstractPage{
    public SelenideElement marka = $("span[data-default-label='Marka']");
    public SelenideElement model = $("span[data-default-label='Model']");

    public void selectBrandCar(String brandCar){
        marka.hover().scrollTo().click();
        $(byAttribute("data-code", brandCar.toLowerCase()))
                .scrollTo().click();
    }
    public void selectModelCar(String modelCar){
        model.hover().scrollTo().click();
        $x("//label[@data-value='" + modelCar.toLowerCase() + "']").click();
    }

    public void selectCarByBrandAndModel(String brandCar, String modelCar){
        selectBrandCar(brandCar);
        selectModelCar(modelCar);
    }
}
