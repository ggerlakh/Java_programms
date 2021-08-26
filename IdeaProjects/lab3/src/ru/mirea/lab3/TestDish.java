package ru.mirea.lab3;

public class TestDish {
    public static void main(String[] args) {
// Создаем объект класса Plate
        Plate p1 = new Plate("white", 50, 6);
// Проверяем работу всех методов класса Plate
        System.out.println(p1.getColor());
        System.out.println(p1.getPrice());
        System.out.println(p1.getShape());
        System.out.println(p1.getArea());
        System.out.println(p1.getRadius());
        System.out.println(p1.toString());
        p1.setColor("red");
        p1.setRadius(10);
        p1.setPrice(65.3);
        System.out.println(p1.toString());
// Создаем объект класса Glass
        Glass g1 = new Glass("blue", 40.1, 6,3);
// Проверяем работу всех методо класса Glass
        System.out.println(g1.getColor());
        System.out.println(g1.getPrice());
        System.out.println(g1.getShape());
        System.out.println(g1.getArea());
        System.out.println(g1.getVolume());
        System.out.println(g1.getRadius());
        System.out.println(g1.toString());
        g1.setColor("green");
        g1.setRadius(4);
        g1.setPrice(77.7);
        System.out.println(g1.toString());
    }

}
