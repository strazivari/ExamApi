# Проект по автоматизации тестирования API для веб-приложения [Reqres](https://reqres.in/), [RickMortyAPI](https://rickandmortyapi.com/api)

## Покрытый функционал

> Разработаны автотесты на <code>API</code>.
> 
> Разработаны автотесты при использовании <code>JSON</code>.

### RickMortyApi

- [x] Составление <code>Response</code> запросов для работы с ветками объектов

### jsonPotato

- [x] Запрос <code>PUT</code>
- [x] Проверка <code>name</code>, <code>job</code>, <code>id</code>, <code>createdAt</code>

## Технологический стек

- [x] IntelliJ IDEA
- [x] Java
- [x] Maven
- [x] Cucumber
- [x] GitHub
- [x] Rest Assured
- [x] Allure Result

> В данном проекте автотесты написаны на <code>Java</code> с использованием библиотеки <code>REST Assured</code> для API-тестов.>
>
> Тест jsonPotato использует <code>JSON</code>.
>
> Для автоматизированной сборки проекта используется <code>Maven</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>Cucumber</code>.
>
> Отчет генерируется с помощью библиотеки <code>Allure</code>.

## Запуск тестов из терминала

### Локальный запуск тестов

```
mvn clean test - запуск всех тестов в проекте
```
```
mvn clean test -Dcucumber.filter.tags="@jsonPotato" - запуск теста jsonPotato

mvn clean test -Dcucumber.filter.tags="@RickMorty" - запуск теста RickMorty
```