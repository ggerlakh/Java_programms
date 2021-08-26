package ru.mirea.pr1;

// Создаем еще один класс для того чтобы протестировать работу программы
public class TestBook {
    public static void main(String[] args) {
// Создадим объект с помощью первого конструктора и проверим работу ранее написанных методов
        Book b1 = new Book();
        System.out.println("Название: " + b1.getName() + " Количество страниц: " + b1.getNumberOfPages());
// Создадим объект с помощью второго конструктора и проверим работу ранее написанных методов
        Book b2 = new Book("Учебник по физике");
        System.out.println("Название: " + b2.getName() + " Количество страниц: " + b2.getNumberOfPages());
// Создадим объект с помощью третьего конструктора и проверим работу ранее написанных методов
        Book b3 = new Book("Учебник по математике", 350);
        System.out.println("Название: " + b3.getName() + " Количество страниц: " + b3.getNumberOfPages());
    }
}

