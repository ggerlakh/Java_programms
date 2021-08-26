package ru.mirea.pr3;
    //Создаем еще один класс для проверки раюоты программы
public class TestShape {
    public static void main(String[] args) {
        //Создаем по одному объекту каждого класса и проверяем работу их методов
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        c1.setRadius(45);
        System.out.println(c1.toString());
        Circle c2 = new Circle(70);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
        System.out.println(c2.getColor());
        System.out.println(c2.isFilled());
        c2.setRadius(35);
        System.out.println(c2.toString());
        Circle c3 = new Circle(6,"none",false);
        System.out.println(c2.getArea());
        System.out.println(c2.toString());
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getArea());
        System.out.println(r1.getLength());
        System.out.println(r1.toString());
        Square s1 = new Square();
        System.out.println(s1.getArea());
        System.out.println(s1.getLength());
        System.out.println(s1.toString());

    }
}
