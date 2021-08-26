package ru.mirea.pr10;
// Реализуем соответствующий интерфейс в абстрактной фабрике
public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex() {
        return new ComplexNumber();
    }
    public Complex createComplex(double real, double image) {
        return new ComplexNumber(real, image);
    }
}
