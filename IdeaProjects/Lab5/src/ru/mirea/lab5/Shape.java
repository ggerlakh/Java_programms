package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
// Создаем родительский класс, наследниками которого будут рисуемые фигуры
public abstract class Shape extends JPanel{
    protected int x1;
    protected int x2;
    protected int y1;
    protected int y2;
    protected int rColor;
    protected int gColor;
    protected int bColor;
    protected int width;
    protected int height;

    public Shape() {}

// Объявдяем абстрактный метод paintComponent,который будет рисовать каждую фигуру
    protected abstract void paintComponent(Graphics g);
}
