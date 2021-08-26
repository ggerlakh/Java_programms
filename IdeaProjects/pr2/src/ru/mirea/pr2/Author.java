package ru.mirea.pr2;

public class Author {
    // Задаем поля данному классу
    public String name;
    public String email;
    public char gender;
    // Создаем конструктор для этого класса
    public Author (String name, String email, char gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }
    // Создаем метод, который будет возвращать имя автора
    public String getName () {
        return name;
    }
    // Создаем метод, который будет возвращать пол автора
    public char getGender() {
        return gender;
    }
    // Создаем метод, который будет возвращать email Автора
    public String getEmail () {
        return email;
    }

    // Создаем метод, который устанавливает введенный пользователем email
    public void setEmail(String email) {
        this.email = email;
    }
    // Создаем метод, который будет выводить на экран основную информацию об авторе
    @Override
    public String toString() {
        return name  + " at " +
                "(" + gender + ")" +
                email;

    }

}
