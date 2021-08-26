package ru.mirea.lab10;

import java.util.Scanner;

public class returnElementOfArray {
    // Создаем метод, возвращающий элемент массива по индексу
    public static int returnElement(int B[]) {
        // Считываем с клавиатуры индекс элемена массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс элемента массива:");
        int i = sc.nextInt();
        // Возвращаем ссответствующий элемент
        return B[i];
    }
    // Проверяем работу программы в методе main
    public static void main(String[] args) {
        int A[] = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = i*10;
        }
        try {
            System.out.println(returnElement(A));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
