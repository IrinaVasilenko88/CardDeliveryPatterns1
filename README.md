[![Build status](https://ci.appveyor.com/api/projects/status/gdg9b450ih5u449a?svg=true)](https://ci.appveyor.com/project/IrinaVasilenko88/carddeliverypatterns1)

# Обучение в Нетологии.

## Домашнее задание по курсу Автоматизированное тестирование

## Тема:Patterns

Автоматизирование тестирования новой функции формы заказа доставки карты(приложение ```app-card-delivery.jar```)
![](https://github.com/netology-code/aqa-homeworks/blob/aqa4/patterns/pic/order.png)

с условием:

- если заполнить форму повторно теми же данными за исключением "Даты встречи", то система предложит перепланировать время встречи

![](https://github.com/netology-code/aqa-homeworks/blob/aqa4/patterns/pic/replan.png)

После нажатия по кнопке "Перепланировать" произойдёт перепланирование встречи:

![](https://github.com/netology-code/aqa-homeworks/blob/aqa4/patterns/pic/success.png)

**Для запуска проекта:**
1. Склонировать проект из репозитория командой 

```
git clone https://github.com/IrinaVasilenko88/CardDeliveryPatterns1.git
``` 
2. Открыть склонированный проект в Intellij IDEA
3. Открыть в терминале каталог ```artifacts```
4. Для запуска приложения ввести команду ```java -jar app-card-delivery.jar```
5. Для запуска в браузере ввести ссылку http://localhost:9999/
6. Запустить команду ```gradlew test```
