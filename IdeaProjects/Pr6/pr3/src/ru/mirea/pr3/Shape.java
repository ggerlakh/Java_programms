package ru.mirea.pr3;
    //Создаем абстрактный класс Shape
public abstract class Shape {
    //Задаем поля этому классу
    protected String color;
    protected boolean filled;
    //Создаем конструктор со значениями параметров по умолчанию
    public Shape() {
        color = "red";
        filled = true;
    }
    //Создаем конструктор с произвольными значениями параметров
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //Создаем методы для данного класса по диаграмме UML
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
