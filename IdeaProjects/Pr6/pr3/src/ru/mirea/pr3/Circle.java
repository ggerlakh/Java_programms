package ru.mirea.pr3;
    //Создаем первого наследника класса Shape - класс Circle
public class Circle extends Shape {
    //Задаем поле данному классу
    protected double radius;
    //Создаем конструктор со значениями параметров по умолчанию
    public Circle(){
        color = "none";
        filled = false;
        radius = 5;

    }
    //Создаем конструктор с произвольным значением параметра radius
    public Circle(double radius) {
        color = "yellow";
        filled = true;
        this.radius = radius;
    }
    //Создаем конструктор с произвольными значениями параметров
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    //Создаем методы для данного класса по диаграмме UML
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
