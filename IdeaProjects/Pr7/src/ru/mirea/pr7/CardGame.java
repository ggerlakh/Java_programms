package ru.mirea.pr7;

import java.util.ArrayDeque;
import java.util.Scanner;
// Создаем класс реализующий игру "В пьяницу"
public class CardGame {
    public static void main(String[] args) {
        // Создаем объект класса Scanner для считывания значений с клавиатуры
        Scanner sc = new Scanner(System.in);
        // Создаем два дека(двух игроков)
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        ArrayDeque<Integer> d2 = new ArrayDeque<>();
        // Перелд началом игры очищаем деки
        d1.clear();
        d2.clear();
        int count = 0;
        // Заполняем деки картами
        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите " + i + " карту первого игрока:");
            d1.add(sc.nextInt());
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите " + i + " карту второго игрока:");
            d2.add(sc.nextInt());
        }
        // Выводим их на экран
        System.out.println("Карты первого игрока:");
        for (int d:
                d1) {
            System.out.println(d);
        }
        System.out.println("Карты второго игрока:");
        for (int d:
                d2) {
            System.out.println("\t" + d);
        }
        while ((count != 106) || (!(d1.isEmpty())) || (!(d2.isEmpty()))) {
            // 9 бьет 0
            if (d1.getFirst() > d2.getFirst()) {
                if ((d1.getFirst() == 9) && (d2.getFirst() == 0)) {
                    d2.addLast(d1.getFirst());
                    d2.addLast(d2.getFirst());
                    d2.removeFirst();
                    d1.removeFirst();
                }
                else {
                    d1.addLast(d1.getFirst());
                    d1.addLast(d2.getFirst());
                    d1.removeFirst();
                    d2.removeFirst();
                }
                count++;
            }
            else {
                if ((d2.getFirst() == 9) && (d1.getFirst() == 0)) {
                    d1.addLast(d1.getFirst());
                    d1.addLast(d2.getFirst());
                    d1.removeFirst();
                    d2.removeFirst();
                }
                else {
                    d2.addLast(d1.getFirst());
                    d2.addLast(d2.getFirst());
                    d2.removeFirst();
                    d1.removeFirst();
                }
                count++;
            }
            // Если у игрока закончились карты - значит он проиграл
            if (d1.isEmpty()) {
                if (count % 10 == 1) {
                    System.out.println("Выиграл второй игрок за " + count + " ход.");
                    break;
                }
                else {
                    System.out.println("Выиграл второй игрок за " + count + " ходов.");
                    break;
                }
            }
            if (d2.isEmpty()) {
                if (count % 10 == 1) {
                    System.out.println("Выиграл первый игрок за " + count + " ход.");
                    break;
                }
                else {
                    System.out.println("Выиграл первый игрок за " + count + " ходов.");
                    break;
                }
            }
            // Если было в игре больше 106 ходов, то ботва
            if (count >= 106) {
                System.out.println("botva");
                break;
            }
        }
    }
}
