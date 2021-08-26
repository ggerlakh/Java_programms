package ru.mirea.lab9;

public class Exception1 {
        public void exceptionDemo() {
            // Обрабатываем исключение при попытки деления на ноль
            try {
                System.out.println(2/0);

            } catch (ArithmeticException e) {
                System.out.println("Attempted divison by zero");
            }
        }
        public static void main(String[] args) {
            Exception1 exception1 = new Exception1();
            exception1.exceptionDemo();
        }
}
