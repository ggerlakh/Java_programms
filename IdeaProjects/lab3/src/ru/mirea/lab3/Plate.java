package ru.mirea.lab3;

public class Plate extends Dish{
    // Задаем поля этому классу
    protected String shape;
    protected double radius;
    // Создаем конструктор этому классу
    public Plate (String color, double price, double radius) {
        shape = "Circle";
        this.radius = radius;
        this.price = price;
        this.color = color;
    }
    // Создаем метод для возврата значения радиуса посуды
    public double getRadius() {
        return radius;
    }
    // Создаем метод для установки значения радиуса посуды
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Создаем метод для возврата значения формы посуды
    @Override
    public String getShape() {
        return shape;
    }
    // Создаем метод для возврата значения площади посуды
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
    // Создаем метод для возврата общих характеристик посуды
    public String toString() {
        return "Price: " + price + '\n' + "Color: " + color + '\n' + "Shape: " + shape + '\n' + "Radius: " + radius + '\n' + "Area: " + getArea();
    }

}
