package ru.mirea.lab9;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception{
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter key");
            String key = myScanner.nextLine();
            while (key.equals("")) {
                System.out.println("Try again!");
                Scanner scanner = new Scanner(System.in);
                key = scanner.nextLine();
            }
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
    public static void main(String[] args) throws Exception {
        // Создаем объект исходного класса, если пользователь ввел неверный ключ, то даем еще одну попытку на ввод
        ThrowsDemo throwsDemo = new ThrowsDemo();
            throwsDemo.getKey();

    }
}
