package ru.mirea.lab3;

public class Glass extends Dish{
    // Задаем поля для этого класса
    protected String shape;
    protected double radius;
    protected double height;
    // Создаем конструктор для этого класса
    public Glass(String color, double price, double radius, double height) {
        shape = "Cylinder";
        this.radius = radius;
        this.price = price;
        this.color = color;
        this.height = height;
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
    // Создаем метод для возврата площади посуды
    @Override
    public double getArea() {
        return 3.14 * radius * 2.0 * height;
    }
    // Создаем метод для возврата объема посуды
    public double getVolume() {
        return 3.14 * radius * radius * height;
    }
    // Создаем метод для возврата общих характеристик посуды
    public String toString() {
        return "Price: " + price + '\n' + "Color: " + color + '\n' + "Shape: " + shape + '\n' + "Radius: " + radius + '\n' + "Area" + getArea() + '\n' + "Height: " + height + '\n' +  "Volume: " + getVolume();
    }

}
