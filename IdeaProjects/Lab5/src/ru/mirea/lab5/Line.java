package ru.mirea.lab5;

import java.awt.*;
// Создаем наследника класса Shape - класс линия
public class Line extends Shape{
    // В конструкторе класса устанавливаем значения унаследованных полей нужным образом
    public Line() {
        x1 = (int) (Math.random() * 100);
        x2 = (int) (Math.random() * 100);
        y1 = (int) (Math.random() * 100);
        y2 = (int) (Math.random() * 100);
        rColor = 0;
        gColor = 0;
        bColor = 0;
    }
// Реализуем абстрактный метод родительского класса, который нарисует 8 линий с произвольным положением и цветом
    public void paintComponent(Graphics g) {
            this.setBackground(Color.WHITE);

            for (int i = 1; i <= 8; i++) {
                g.setColor(new Color(rColor + (int) (Math.random() * 255) , gColor + (int) (Math.random() * 255), bColor + (int) (Math.random() * 255)));
                g.drawLine(x1 + (int) (Math.random() * 400), y1 + (int) (Math.random() * 400), x2 + (int) (Math.random() * 400), y2 + (int) (Math.random() * 400));
            }
    }
}
