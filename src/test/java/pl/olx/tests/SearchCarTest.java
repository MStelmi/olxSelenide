package pl.olx.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SearchCarTest extends AbstractTest{

    @DisplayName("User should be able to select cars(string value source) when")
    @CsvSource({"Honda, Accord", "Ford, Fiesta", "Porsche, Cayenne"})
    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    void shouldBeSearchableByBrandAndModel(String brand, String model) {
        homePage.navigateToSamochodyOsobowe();
        carPage.selectCarByBrandAndModel(brand, model);
        String expectedText = String.format("%s %s", brand, model);
        resultsPage.verifyResults(expectedText.toLowerCase());
    }
}
