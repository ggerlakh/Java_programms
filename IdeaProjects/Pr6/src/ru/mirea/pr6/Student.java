package ru.mirea.pr6;
// Создаем класс Student с полем iDNumber, который нужно будет отсортировать
public class Student {

    public int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

// Сщздаем метод main для проверки работы программы
    public static void main(String[] args) {
        // Создаем массив объектов класса Student
        Student[] st = new Student[5];
        // Заполняем этот массив
        st[0] = new Student(67);
        st[1] = new Student(7);
        st[2] = new Student(80);
        st[3] = new Student(5);
        st[4] = new Student(99);
        // Создаем объект класса Sorting
        Sorting sorting = new Sorting();
        // Используем метод sort для сортировки массива
        sorting.sort(st);
        // Выводим отсортированный массив на экран
        for (int j = 0; j < 5; j++)
            System.out.println(st[j].iDNumber);
    }
}
