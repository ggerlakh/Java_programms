package ru.mirea.lab4.Priceable;
// Создаем еще один класс для проверки работы программы
public class Test {
    public static void main(String[] args) {
        // Создаем объект первого класса
        Car c1 = new Car();
        // Выводим на экран цену этого объекта
        System.out.println("Car price: " + c1.getPrice() + "$");
        // Создаем объект второго класса
        Computer computer = new Computer();
        // Создаем объект первого класса
        System.out.println("Computer price: " + computer.getPrice() + "$");
    }
}
