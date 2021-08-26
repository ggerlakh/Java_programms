package ru.mirea.pr3;
    //Создаем второго наследника класса Shape - класс Rectangle
public class Rectangle extends Shape {
    //Задаем поля данному классу
    protected double width;
    protected double length;
    //Создаем конструктор со значениями параметров по умолчанию
    public Rectangle() {
        color = "blue";
        filled = true;
        width = 10;
        length = 7;
    }
    //Создаем второй конструктор с произвольными значениями параметров width и length
    public Rectangle(double width, double length) {
        color = "green";
        filled = true;
        this.width = width;
        this.length = length;
    }
    //Создаем конструктор с произвольными значениями параметров
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    //Создаем методы для данного класса по диаграмме UML
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}' + "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
