package ru.mirea.lab12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Создаем класс для проверки пароля на надежность
public class CheckPassword {
    public static void main(String[] args) {
        // Создаем три шаблона, которые будут содержать латинские буквы верхних и нижних регистров, и цифры соответственно
        Pattern p1 = Pattern.compile(".*[A-Z].*");
        Pattern p2 = Pattern.compile(".*[a-z].*");
        Pattern p3 = Pattern.compile(".*[0-9].*");
        // Вводится пароль с клавиатуры
        System.out.println("Введите пароль: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        // Проверяется поиск нужных символов
        Matcher m1 = p1.matcher(password);
        Matcher m2 = p2.matcher(password);
        Matcher m3 = p3.matcher(password);
        boolean a = m1.matches();
        boolean b = m2.matches();
        boolean c = m3.matches();
        // Есди все условия выполнены и пароль имеет нужную длину, то он надежный
        if((a)&(b)&(c)&(password.length()>=8)) {
            System.out.println("Введен надежный пароль!");
        }
        else {
            System.out.println("Введен не надежный пароль!");
        }

    }
}
