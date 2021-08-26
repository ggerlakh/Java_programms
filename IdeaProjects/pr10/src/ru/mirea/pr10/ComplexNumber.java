package ru.mirea.pr10;
// Реализуем соответствующий интерфейс в классе комплексных чисел
public class ComplexNumber implements Complex {
    public double real;
    public double image;
    ComplexNumber() {
        real = 3.8;
        image = 4.1;
    }
    ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }
    public void showNumber() {
        if (image < 0) {
            System.out.println(real + "" + image + "*i");
        }
        else if (image == 0){
            System.out.println(real);
        }
        else {
            System.out.println(real + "+" + image + "*i");
        }
    }
}
