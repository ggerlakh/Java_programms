package ru.mirea.lab4.Priceable;
// Создаем класс "машина" для того чтобы измерить цену его объектов при помощи интерфейса Priceable
public class Car implements Priceable{
    // Создаем поле класса
    public int price;
    // Создаем конструктор класса со значением поля по умолчанию
    Car() {
        price = 13000;
    }
    // Реализуем метод интерфейса Priceable
    @Override
    public int getPrice() {
        return price;
    }
}
