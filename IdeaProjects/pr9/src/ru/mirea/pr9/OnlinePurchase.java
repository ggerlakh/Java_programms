package ru.mirea.pr9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        // Для соответствия инн используем структуру данных map
        Map<String, String> map = new HashMap<String, String>();
        // Заполняем ее
        map.put("1022", "Иванов Сергей Петрович");
        map.put("0112", "Петрова Анна Ивановна");
        // Считываем с клавитуры фио
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String fio = scanner.nextLine();
        // Проверяем на правильность ввод данных
        if (map.containsValue(fio) == false) {
            System.out.println("Такого человека в списке нет!");
        }
        else {
            System.out.println("Введите ИНН");
            String inn = scanner.nextLine();
            try {
                if ((!map.get(inn).equals(fio))) {
                    // Если инн неверный, генерируем собственное исключение
                    throw new Exception("Введен недействительный ИНН!");
                } else {
                    System.out.println("Введен действительный ИНН!");
                }
            } catch (Exception e) {
                System.out.println("java.lang.Exception: Введен недействительный ИНН!");
            }
        }
    }
}
