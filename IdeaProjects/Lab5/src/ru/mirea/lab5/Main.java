package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
// Создаем класс Main для реализации программы
public class Main {

    public static void main(String[] args) {
        // Создаем окно, в котором будут нарисованы фигуры, и задаем этом окну заголовок
        JFrame frame = new JFrame("Lab №5");
        // Выбираем нужный макет дляразмещения фигур в окне
        frame.setLayout(new GridLayout(1,1));
        // Завершаем программу при закрытии окна с нарислванными фигурами
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создаем объект класса Line
        Line l = new Line();
        l.setBackground(Color.WHITE);
        // Добавляем объект класса Line
        frame.add(l);
        // Создаем объект класса Oval
        Oval o = new Oval();
        o.setBackground(Color.WHITE);
        // Добавляем объект класса Oval
        frame.add(o);
        // Создаем объект класса Rectangle
        Rectangle r = new Rectangle();
        r.setBackground(Color.WHITE);
        // Добавляем объект класса Rectangle
        frame.add(r);
        // Задаем начальный размер окна
        frame.setSize(3000,3000);
        frame.setVisible(true);
    }
}
