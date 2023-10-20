package asserts;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import io.qameta.allure.Step;

import static asserts.AssertTemplate.testParams;
import static api.PotatoApi.*;

public class JsonAsserts {
    @Step("Проверка имени")
    @Тогда("Проверяем корректность имени")
    public static void nameCheck() {
        testParams(sendJson.getString("name"), "Tomato", "Wrong name");
    }

    @Step("Проверка профессии")
    @И("Проверяем корректность профессии")
    public static void jobCheck() {
        testParams(sendJson.getString("job"), "Eat maket", "Wrong job");
    }

    @Step("Проверка id")
    @И("Проверяем валидность id")
    public static void idCheck() {
        testParams(sendJson.getString("id"), "Wrong id");
    }

    @Step("Проверка даты создания")
    @И("Проверяем валидность даты создания")
    public static void createdAtCheck() {
        testParams(sendJson.getString("createdAt"), "Wrong creation time");
    }
}
