package ru.mirea.lab4.Priceable;
// Создаем класс "компьютер" для того чтобы измерить цену его объектов при помощи интерфейса Priceable
public class Computer implements Priceable{
    // Создаем поле класса
    public int price;
    // Создаем конструктор класса со значением поля по умолчанию
    Computer() {
        price = 1500;
    }
    // Реализуем метод интерфейса Priceable
    @Override
    public int getPrice() {
        return price;
    }
}
