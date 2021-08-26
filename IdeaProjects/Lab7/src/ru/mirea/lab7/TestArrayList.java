package ru.mirea.lab7;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Создаем список целых чисел
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Заполняем этот список
        for (int i = 0; i < 11; i++) {
            numbers.add(i, 48 * i + i);
        }
        // Удаляем элемент с индексом 0
        numbers.remove(0);
        // Выводим оставшиеся элементы на экран
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}
