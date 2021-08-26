package ru.mirea.lab2;

public class TestCircle {
    public static void main(String[] args) {
// Создаем объект класса Circle с парамером radius = 8
        Circle c1 = new Circle(8);
// Выводим на экран результат работы метода getRadius()
        System.out.println("Radius equals " + c1.getRadius());
// Выводим на экран результат работы метода getLength()
        System.out.println("Length equals " + c1.getLength());
// Выводим на экран результат работы метода getArea()
        System.out.println("Area equals " + c1.getArea());
// Выводим на экран результат работы метода toString()
        System.out.println(c1.toString());
// Устанавливаем новый радиус для объекта с1
        c1.setRadius(5);
// Выводим на экран результат работы программы после установки нового значениея радиуса(проверка работы метода setRadius()
        System.out.println(c1.toString());
    }

}
