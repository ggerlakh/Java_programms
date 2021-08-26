package ru.mirea.pr10;
// Создаем интерфейс абстрактной фабрики
public interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(double real, double image);
}
