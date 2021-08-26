package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Создаем класс Menu
public class Menu extends JFrame{
    // Создаем поле для написания текста с заданным размером
    JTextArea jta = new JTextArea(100,100);
    // Указываем виды шрифтов, которые будут доступны в нашем меню
    Font f1 = new Font("Times New Roman",Font.BOLD,10);
    Font f2 = new Font("MS Sans Serif",Font.BOLD,10);
    Font f3 = new Font("Courier New",Font.BOLD,10);
    // Создаем конструктор исходного класса
    public Menu() {
        // Устанавливаем заголовок в окне, которое будет содержать наше меню
        super("Lab №6");
        // Добавляем уже созданное нами поле для написания текста в это окно
        add(jta);
        // При закрытии окна завершаем работу программы
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создем строку меню, в которой будут несколько опций для работы с написанным текстом в поле(выбор цвета и шрифта написанного текста)
        JMenuBar menuBar  = new JMenuBar();
        menuBar.add(createColorMenu());
        menuBar.add(createFontMenu());
        setJMenuBar(menuBar);
        // Устанавливаем изначальный размер окна
        setSize(400,400);
        // выбираем нужный макет
        setLayout(new FlowLayout());
        setVisible(true);
    }
    // Реализуем первую опцию(выбор цвета текста) в строке меню
    private JMenu createColorMenu() {
        // Создаем кнопку с соответствующим выпадающим списоком нескольких реализации данной опции
        JMenu j1 = new JMenu("Цвет");
        JMenuItem ji1 = new JMenuItem("Синий");
        JMenuItem ji2 = new JMenuItem("Красный");
        JMenuItem ji3 = new JMenuItem("Черный");
        // Добавляем эти реализации в выпадающий список и разделяем каждую реализацю(кнопки с выбором цвета теста в данном сдучае)
        j1.add(ji1);
        j1.addSeparator();
        j1.add(ji2);
        j1.addSeparator();
        j1.add(ji3);
        // Осуществляем выбор данной реализации(окрас текста в синий, черный или красный цвет в данном случае)
        ji1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLUE);
            }
        });
        ji2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.RED);
            }
        });
        ji3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLACK);
            }
        });
        return j1;
    }
    // Анадогичеой реализуем вторую опцию(выбор шрифта)
    private JMenu createFontMenu() {
        JMenu j2 = new JMenu("Шрифт");
        JMenuItem ji4 = new JMenuItem("Times New Roman");
        JMenuItem ji5 = new JMenuItem("MS Sans Serif");
        JMenuItem ji6 = new JMenuItem("Courier New");
        j2.add(ji4);
        j2.addSeparator();
        j2.add(ji5);
        j2.addSeparator();
        j2.add(ji6);
        ji4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(f1);
            }
        });
        ji5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(f2);
            }
        });
        ji6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(f3);;
            }
        });

        return j2;
    }
    // Создаем метод main для проверки работы программы
    public static void main(String[] args) {
        new Menu();
    }
}
