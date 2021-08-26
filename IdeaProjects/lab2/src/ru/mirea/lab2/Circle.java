package ru.mirea.lab2;

public class Circle {
    // Создаем поле для данного класса
// В качестве поля выступает переменная типа дабл radius
    public double radius;
    // Создаем конструктор с таким же именем как у класса
// В качестве параметра конструктору передаем переменную radius
    public Circle(double radius) {
        this.radius = radius;
    }
    // Создаем метод setRadius(), который позволяет установить нужное значение радиуса
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Создаем метод getRadius(), который будет возвращать значения радиуса круга
    public double getRadius() {
        return radius;
    }
    // Создаем метод getLength(), который будет возвращать значение длины окружности с заданным радиусом
    public double getLength() {
        return 2.0 * 3.14 * radius;
    }
    // Создаем метод getArea(), который будет возвращать значение площади окружности с заданным радиусом
    public double getArea() {
        return 3.14 * radius * radius;
    }
    // Создаем метод toString(), который будет выводить на экран основную информацию о данной окружности
    public String toString() {
        return "Radius equals " + radius + '\n' + "Length equals " + 2.0 * 3.14 * radius + '\n' + "Area equals " + 3.14 * radius * radius + '\n';
    }

}
