package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static api.PotatoApi.*;
import static api.RickMortyApi.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/cucumberRickMorty.feature",
        glue = {"asserts", "api", "Hooks"},
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "json:target/cucumber,json",
                "html:test-output"},
        publish = true)
public class TestRunner {
}
public class ApiJsonTest {
    @BeforeAll
    public static void allureSubThreadParallel(){
        String listenerName = "AllureSelenide";
        if (!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    (new AllureSelenide().screenshots(true).savePageSource(false)));

    }
    @Test
    public void rickMortyTest() {
        rickMorty("2");
        gettingLastEpisode();
        gettingCharLastEpisode();
        gettingCharInfoLastEpisode();
        locCheck(charLoc, lastCharLocation);
        speciesCheck(charSpecies, lastCharSpecies);
    }

    @Test
    public void jsonTest() throws IOException {
        getJSONFromFile();
        nameCheck();
        jobCheck();
        idCheck();
        createdAtCheck();
    }
}
