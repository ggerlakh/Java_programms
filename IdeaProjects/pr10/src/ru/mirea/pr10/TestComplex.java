package ru.mirea.pr10;
// Создаем тестовый класс для проверки работы программы
public class TestComplex {
    public static void main(String[] args) {
        ComplexAbstractFactory cf = new ConcreteFactory();
        Complex c = cf.createComplex();
        c.showNumber();
        ComplexAbstractFactory cfp = new ConcreteFactory();
        Complex c1 = cfp.createComplex(2, 0);
        c1.showNumber();

    }
}
