package com.company;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.everit.json.schema.Schema;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Ввод файла или пути к файлу
        System.out.println("Введите имя файла или путь к файлу:");
        Scanner in = new Scanner(System.in);
     String fileName = in.nextLine();
        while (!new File(fileName).exists())
        {
            System.out.println("Указанного файла не существует!");
            System.out.println("Введите имя или путь файла:");
            fileName = in.nextLine();
        }

       String json = new String(Serializator.readFileToString(fileName));

        // 2. Валидация
       try
       {  FileReader fileSchema = new FileReader("cat-schema.json");
           JSONObject rawSchema = new JSONObject(new JSONTokener(fileSchema));
           Schema schema = SchemaLoader.load(rawSchema);
          JSONObject fileName2 = new JSONObject(Serializator.readFileToString(fileName));
           schema.validate(fileName2);
       } catch (JSONException e) {
           e.printStackTrace();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       catch (Exception e) {
           e.printStackTrace();
       }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
       //Десериализация

     ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            Animal animal = mapper.readValue(json, Animal.class);
            System.out.println(animal.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
         Animal animal = new Animal();
        try {
            animal= gson.fromJson(new FileReader(fileName), Animal.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Сериализация
// красивый вывод
            JsonElement json1 = null;
            try {
                json1 = gson.fromJson(new FileReader(fileName), JsonElement.class);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String result = gson.toJson(json1);
           System.out.println(result);

    }



}
