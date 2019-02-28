package pl.olx.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pl.olx.HomePage;
import pl.olx.ResultsPage;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class AbstractTest {
    String url = "https://olx.pl";
    final Integer time = 30;

    public HomePage homePage;
    public ResultsPage resultPage;

    public void setup() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout  = time;
    }
    @BeforeEach
    public void openSession(){
        setup();
        open(url);
    }
    @AfterEach
    public void closeSession(){
       close();
       System.out.println("session is closed");
    }
}
