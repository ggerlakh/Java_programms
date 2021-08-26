package ru.mirea.lab5;

import java.awt.*;
// Создаем наследника класса Shape - класс овал
public class Rectangle extends Shape{
    // В конструкторе класса устанавливаем значения унаследованных полей нужным образом
    public Rectangle() {
        x1 = (int) (Math.random() * 100);
        y1 = (int) (Math.random() * 100);
        rColor = 0;
        gColor = 0;
        bColor = 0;
        width = (int) (Math.random() * 100);
        height = (int) (Math.random() * 100);
    }
    // Реализуем абстрактный метод родительского класса, который нарисует 6 прямоугольников с произвольным положением и цветом
    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        for (int i = 1; i <= 6; i++) {
            g.setColor(new Color(rColor + (int) (Math.random() * 255), gColor + (int) (Math.random() * 255), bColor + (int) (Math.random() * 255)));
            g.fillRect(x1 + (int) (Math.random() * 400), y1 + (int) (Math.random() * 400), width + (int) (Math.random() * 50), height + (int) (Math.random() * 50));
        }
    }
}
