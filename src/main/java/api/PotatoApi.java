package api;

import static api.ApiTemplate.*;
import static configuration.Configuration.getProperty;

import io.cucumber.java.ru.Дано;
import io.qameta.allure.Step;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PotatoApi {
    public static JSONObject sendJson;

    @Step("JSON запрос PUT name, job. Получение объекта JSON")
    @Дано("JSON запрос PUT name, job. Получение объекта JSON")
    public static JSONObject getJSONFromFile() throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get("src/test/resources/json/potato.json"));
        JSONObject json = new JSONObject(encoded, "UTF-8");
        json.put("name", "Tomato");
        json.put("job", "Eat maket");
        sendJson = new JSONObject(postRequest(json, getProperty("hostPotato"), getProperty("hostPotatoPost")).getBody().asString());
        return null;
    }


}
