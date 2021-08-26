package ru.mirea.pr2;
//Создаем еще один класс для проверки работы программы
public class TestAuthor {
    public static void main(String[] args) {
// Создаем объект класса Author
        Author a1 = new Author("Anna Petrova", "anPetrova@gmail.com", 'F');
// Проверяем работу ранее написанных методов и выводим содержимое на экран
        System.out.println(a1.toString());
        System.out.println(a1.getGender());
        System.out.println(a1.getName());
        a1.setEmail("anPetrova@mail.com");
        System.out.println(a1.getEmail());

    }

}
