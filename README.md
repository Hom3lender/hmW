# Исключения в программировании и их обработка (лекции)

![Exceptions in Java](https://i.postimg.cc/sgC4X0mg/java-exceptions.png "Exceptions in Java")

## Урок 1. Обработка ошибок в программировании

### Описание
## План урока:
- Откуда берутся ошибки?
- Как программа оповещает об ошибках с помощью кодов ошибок?
- Как программа оповещает об ошибках с помощью исключений?
- Зачем обрабатывать ошибки?
- Пример обработки ошибок


## Урок 2. Исключения и их обработка

### Описание
## План урока:
- Разберём виды исключений в Java, какую иерархию они образуют и в чём её смысл
- Узнаем, чем исключения отличаются от ошибок
- Поймём, как не дать исключениям «ронять» приложение
- Узнаем, почему некоторые исключения компилятор заставляет обрабатывать, а некоторые нет
- 

## Урок 3. Продвинутая работа с исключениями в Java

### Описание
## План урок:
- Блок try-with-resources
- Обработка исключений на уровне выше по стеку
- Собственные типы исключений


# Исключения в программировании и их обработка (семинары)

## Урок 1. Обработка ошибок в программировании

### Описание
## План урока:
- посмотреть откуда могут браться ошибки
- научиться обрабатывать исключительные ситуации с помощью кодов ошибок и исключений
- научиться бросать исключения, когда метод не может выполнить корректно свою работу
### Домашнее задание :
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут
   сможете получить?
3. Реализуйте метод, принимающий в качестве аргументов два целочисленных
   массива, и возвращающий новый массив, каждый элемент которого равен
   разности элементов двух входящих массивов в той же ячейке. Если длины
   массивов не равны, необходимо как-то оповестить пользователя.
4. Реализуйте метод, принимающий в качестве аргументов два целочисленных
   массива, и возвращающий новый массив, каждый элемент которого равен
   частному элементов двух входящих массивов в той же ячейке. Если длины
   массивов не равны, необходимо как-то оповестить пользователя. Важно:
   При выполнении метода единственное исключение, которое пользователь
   может увидеть - RuntimeException, т.е. ваше


## Урок 2. Исключения и их обработка

### Описание
## План урока:
- Именование классов исключений, Иерархия типов исключений и ошибок, Error, Checked, Unchecked Exceptions,
- Обработка исключений с помощью try-catch и throws,
- порядок следования блоков catch, блок finally.
### Домашнее задание :
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
2. Если необходимо, исправьте данный код (задание 2
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
3. Дан следующий код, исправьте его там, где требуется (задание 3
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


## Урок 3. Продвинутая работа с исключениями в Java

### Описание
## План урок:
- Блок try-with-resources
- Обработка исключений на уровне выше по стеку
- Собственные типы исключений
### Домашнее задание :

Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
```
Фамилия Имя Отчество датарождения номертелефона пол
```
Форматы данных:
```
фамилия, имя, отчество - строки 
датарождения - строка формата yyyy.mm.dd
номертелефона - целое беззнаковое число без форматирования 
пол - символ латиницей f или m
```
Приложение должно проверить введенные данные по количеству. 
Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, 
что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. 

Можно использовать встроенные типы java и создать свои. 
Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, 
в него в одну строку должны записаться полученные данные, вида: 
```
<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
```

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, 
пользователь должен увидеть стектрейс ошибки.
