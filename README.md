# Проект по автоматизации тестирования API для веб-приложения [Reqres](https://reqres.in/)

## <img width="4%" title="Functional" src="images/function.png"> Покрытый функционал

> Разработаны автотесты на <code>API</code>.

### API

- [x] Запрос <code>POST</code>
- [x] Отображение <code>statusCode</code> и <code>body</code> в ответе запроса

## <img width="4%" title="Technologies" src="images/technologies.png"> Технологический стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/intellij.svg">
<img width="5%" title="Java" src="images/logo/java.svg">
<img width="6%" title="Gradle" src="images/logo/maven.svg">
<img width="5%" title="JUnit5" src="images/logo/cucumber.svg">
<img width="5.5%" title="GitHub" src="images/logo/github.svg">
<img width="6%" title="Rest Assured" src="images/logo/rest.svg">
<img width="6%" title="Rest Assured" src="images/logo/allure.svg">
</p>

> В данном проекте автотесты написаны на <code>Java</code> с использованием библиотеки <code>REST Assured</code> для API-тестов.
>
> Для автоматизированной сборки проекта используется <code>Maven</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>Cucumber</code>.
>
> Отчет генерируется с помощью библиотеки <code>Allure</code>.

## <img width="4%" title="Terminal" src="images/cmd.png"> Запуск тестов из терминала

### <img width="4%" src="images/play.png"> Локальный запуск тестов

```
mvn clean test - запуск всех тестов в проекте
```
```
mvn clean test -Dgrops="@jsonPotato" - запуск теста jsonPotato

mvn clean test -Dgrops="@RickMorty" - запуск теста RickMorty
```