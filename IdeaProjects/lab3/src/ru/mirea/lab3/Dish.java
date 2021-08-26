package ru.mirea.lab3;

public abstract class Dish {
    // Задаем поля данному классу,а именно цвет и цену, которые далее унаследуют дочерние классы вместе с методами
    protected String color;
    protected double price;
    // Создаем конструктор для асбтрактного класса
    public Dish() {
    }
    // Создаем метод для установки значения цены посуды
    public void setPrice(Double price) {
        this.price = price;
    }
    // Создаем метод для установки значения цвета посуды
    public void setColor(String color) {
        this.color = color;
    }
    // Создаем метод для возврата значения цвета посуды
    public String getColor() {
        return color;
    }
    // Создаем метод для возврата значения цены посуды
    public double getPrice() {
        return price;
    }
    // Создаем два абстрактных метода для дальнейшей реализации их в дочерних классах
    public abstract String getShape();
    public abstract double getArea();

}
