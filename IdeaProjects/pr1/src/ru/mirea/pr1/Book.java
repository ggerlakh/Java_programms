package ru.mirea.pr1;


    // Создаем класс "книга"
public class Book {
        // Создаем поля данного класса
        private String name;
        private int numberOfPages;
        // Создаем три конструктора для данного класса
// В первом конструкторе значения полей будут установлены по умолчанию
        public Book() {
            name = "'Обломов'";
            numberOfPages = 500;
        }
        // Во втором конструкторе в качестве параметра передается название книги
        public Book(String name) {
            this.name = name;
            numberOfPages = 500;
        }
        // В третьем конструкторе в качестве параметров передаются оба поля класса
        public Book(String name, int numberOfPages) {
            this.name = name;
            this.numberOfPages = numberOfPages;
        }
        // Создаем метод getName(), который будет возвращать название книги
        public String getName() {
            return name;
        }
        // Создаем метод getNumberOfPages(), который будет возвращать количество страниц книги
        public int getNumberOfPages() {
            return numberOfPages;
        }
}


