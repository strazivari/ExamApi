package asserts;

import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;

import static asserts.AssertTemplate.testParams;

public class RickMortyAsserts {
    @Step("Проверка локаций первого и второго персонажей")
    @Затем("Выполнение проверки срванения локаций первого и второго персонажей")
    public static void speciesCheck(String charSpecies, String lastCharSpecies) {
        testParams(charSpecies, lastCharSpecies, "Вид не совпадает");
    }

    @Step("Проверка вида первого и второго персонажей")
    @И("Выполнение проверки срванения видов первого и второго персонажей")
    public static void locCheck(String charLoc, String lastCharLocation) {
        testParams(charLoc, lastCharLocation, "Локации не совпадают");
    }
}
