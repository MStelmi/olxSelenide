package pl.olx.tests;

import org.junit.jupiter.api.Test;

public class SearchCarTest extends AbstractTest{
    boolean results;
    String url = "https://www.olx.pl/";
    String brandCar = "honda";
    String modelCar = "accord";

    @Test
    public void SearchCarTest() {
    homePage.categoryMotoryzacja.click();
    homePage.subCategorySamochodyOsobowe.click();
    homePage.selectBrandCar(brandCar);
    homePage.selectModelCar(modelCar);
    results = resultPage.verifyResults(brandCar + " " + modelCar);
    }

}
