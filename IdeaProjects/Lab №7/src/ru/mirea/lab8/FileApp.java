package ru.mirea.lab8;

import java.io.*;

public class FileApp {
    public static void main(String[] args) {
        // Создаем объект класса FileWriter и пытаемся записать информацию в нужный файл
        try(FileWriter writer = new FileWriter("C:\\Users\\Света\\Desktop\\Documents\\javalab8.txt", false)) {
            String text = "Лабораторная работа №8.";
            // Записываем нужную строку в файл
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        // Обработка исключения при работе с файлом
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        // Создаем объект класса FileReader и пытаемся рочитать информацию из нужного файла
        try(FileReader reader = new FileReader("C:\\Users\\Света\\Desktop\\Documents\\javalab8.txt")) {
            int c;
            String line = "";
            // Посимвольно считываем информацию из файла
            while((c = reader.read()) != -1) {
                line = line + (char)c;
            }
            // Выводим прочитанное на экран
            System.out.println(line);
        }
        // Обработка исключения при работе с файлом
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
