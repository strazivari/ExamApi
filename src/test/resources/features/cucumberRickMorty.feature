# encoding: utf-8
# language: ru

Функция: Тестирование edujira.ifellow.ru

  Сценарий: Получение информации о персонаже с последующим изучением связывающих его элементов
  Дано Получение информации о персонаже с id "2"
  Тогда Выбор последнего эпизода, где появлялся персонаж
  Затем Получение id последнего персонажа последней локации последнего эпизода, где появлялся персонаж
  Затем Получение информации о полученном персонаже из последнего эпизода, где появлялся персонаж из первого шага
  Затем Выполнение проверки срванения локаций первого и второго персонажей
  И Выполнение проверки срванения видов первого и второго персонажей