#language: ru
@withdrawal
Функция: Снятие денег со счета


  Структура сценария: Создание файла
    Дано Есть объект типа String со значением X, равным <имя файла>
    Когда Я создаю файл с именем X
    Тогда Существует файл с именем X, равным <имя или путь файла>

    Примеры:
      | имя файла         | имя или путь файла |
      | "filetest1.txt "    | "filetest1.txt"      |
      | "e:\\testfile1.txt" | "e:\\testfile1.txt"  |
