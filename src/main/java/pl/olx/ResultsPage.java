package pl.olx;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class ResultsPage extends AbstractPage {

    private ElementsCollection results = $$("table[summary='Ogłoszenia'] tr.wrap td.title-cell a");

    public void verifyResults(String result){
        for (int i = 0; i < result.length(); i++) {
            results.get(i).scrollTo().shouldHave(text(result.toLowerCase()));
        }
    }
}
