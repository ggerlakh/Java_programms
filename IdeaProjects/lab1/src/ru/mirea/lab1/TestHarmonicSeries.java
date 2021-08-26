package ru.mirea.lab1;

public class TestHarmonicSeries {
    public static void main(String[] args) {
// Создаем объект класса HarmonicSeries с парамером n = 10
        HarmonicSeries h1 = new HarmonicSeries(10);
// Выводим на экран результат работы метода getSum()
        System.out.println("Sum equals " + h1.getSum());
// Выводим на экран результат работы метода returnTerms()
        h1.returnTerms();
    }

}
