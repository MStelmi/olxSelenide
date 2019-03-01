package pl.olx.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pl.olx.AbstractPage;
import pl.olx.CarPage;
import pl.olx.HomePage;
import pl.olx.ResultsPage;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractTest {
    static final Integer time = 1000 * 30;

    HomePage homePage = new HomePage();
    CarPage carPage = new CarPage();
    ResultsPage resultsPage = new ResultsPage();

    @BeforeAll
    public static void setup() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout  = time;
    }
    @BeforeEach
    public void openSession(){
        open(homePage.getUrl());
    }
    @AfterEach
    public void closeSession(){
       close();
       System.out.println("session is closed");
    }
}
