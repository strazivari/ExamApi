package hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

public class WebHooks {
    @Before
    public static void allureSubThreadParallel() {
        String listenerName = "AllureSelenide";
        if(!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    (new AllureSelenide().screenshots(true).savePageSource(false)));
    }
}