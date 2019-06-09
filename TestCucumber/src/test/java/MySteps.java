import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

import java.io.File;
import java.io.IOException;

public class MySteps {
    String x;
    File filex;

    @Дано("Есть объект типа String со значением X, равным {string}")
    public void естьОбъектТипаStringСоЗначениемXРавным(String string) {
        x = string;
        System.out.println("String " +x+ " is valid");
    }

    @Когда("Я создаю файл с именем X")
    public void яСоздаюФайлСИменемX() {
       File file = new File(x);
       this.filex=file;
        System.out.println("File " + file+" is created");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Тогда("Существует файл с именем X, равным {string}")
    public void существуетФайлСИменемXРавным(String string) {
       if (filex.exists())
       {
           System.out.println("File "+filex +" exists!");
       }
    }


}
