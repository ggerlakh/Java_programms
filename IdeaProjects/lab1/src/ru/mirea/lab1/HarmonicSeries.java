package ru.mirea.lab1;

public class HarmonicSeries {
    // Создаем поля для данного класса
// В качестве полей выступают две переменнные типа дабл: номер(n) и сумма(sum)
    public double n;
    public double sum = 0;
    // Создаем конструктор с таким же именем как у класса
// В качестве параметра конструктору передаем номер n
    public HarmonicSeries (int n) {
        this.n = n;
    }
    // Создаем метод getSum(), который будет возвращать сумму первых n членов Гармонического ряда
    public double getSum() {
        for (double i = 1; i <= n; i++) {
            sum += 1/i;
        }
        return sum;
    }
    // Создаем метод returnTerms(), который будет выводить первые n членов Гармонического ряда на экран
    public void returnTerms() {
        for (double i = 1; i <= n; i++) {
            System.out.println("The " + i + " term equals " + 1 / i + "\n");
        }
    }

}
