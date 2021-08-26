package ru.mirea.lab9;

import java.util.Scanner;

public class Exception2 {

    public void exceptionDemo() {
        // Обрабатываем исключение в зависимостиот того, что было введено пользователем
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e) {
            System.out.println("Произошла ошибка!");
            }
        }
        public static void main(String[] args) {
            Exception2 exception2 = new Exception2();
            exception2.exceptionDemo();
        }
}
