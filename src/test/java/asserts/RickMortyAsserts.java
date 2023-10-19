package asserts;

import io.qameta.allure.Step;

import static api.ApiTemplate.testParams;

public class RickMortyAsserts {
    @Step("Проверка локаций первого и второго персонажей")
    public static void speciesCheck(String charSpecies, String lastCharSpecies) {
        testParams(charSpecies, lastCharSpecies, "Вид не совпадает");
    }

    @Step("Проверка вида первого и второго персонажей")
    public static void locCheck(String charLoc, String lastCharLocation) {
        testParams(charLoc, lastCharLocation, "Локации не совпадают");
    }
}
