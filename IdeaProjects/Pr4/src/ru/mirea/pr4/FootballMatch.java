package ru.mirea.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame {
    // Создаем поля для счета голов играющих команд
    int scoreACM = 0;
    int scoreRM = 0;
    // Создаем поля для определения победителя и для определения команды, которая последняя забила гол
    String LS = "N/A";
    String W = "DRAW";
    // Создаем две кнопки и три надписи
    JButton b1 = new JButton("AC Milan");
    JButton b2 = new JButton("Real Madrid");
    JLabel l1 = new JLabel("Result: " + scoreACM + " X " + scoreRM);
    JLabel l2 = new JLabel("Last Scorer: " + LS);
    JLabel l3 = new JLabel("Winner: " + W);

    public FootballMatch() {
        // Устанавливаем заголовок окна
        super("Практическая работа №4");
        // Выбираем макет
        setLayout(new FlowLayout());
        // Завершаем работу программы при закрытии окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Задаем размер окна
        setSize(500,500);
        // Добавляем на макет две кнопки и три надписи
        add(b1);
        add(b2);
        add(l1);
        add(l2);
        add(l3);
        // Определяем действие при нажатии на кнопку
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // При нажатии на кнопку Милана у этой команды инкрементируется счет
                // и идет проверка на победителя и на последнего забившего
                scoreACM++;
                LS = "AC Milan";
                l1.setText("Result: " + scoreACM + " X " + scoreRM);
                l2.setText("Last Scorer: " + LS);
                if (scoreACM > scoreRM) {
                    W = "AC Milan";
                    l3.setText("Winner: " + W);
                }
                if (scoreACM < scoreRM) {
                    W = "Real Madrid";
                    l3.setText("Winner: " + W);
                }
                if (scoreACM == scoreRM) {
                    W = "DRAW";
                    l3.setText("Winner: " + W);
                }
            }
        });
        // Определяем действие при нажатии на кнопку
        b2.addActionListener(new ActionListener() {
            @Override
            // При нажатии на кнопку Реала у этой команды инкрементируется счет
            // и идет проверка на победителя и на последнего забившего
            public void actionPerformed(ActionEvent e) {
                scoreRM++;
                LS = "Real Madrid";
                l1.setText("Result: " + scoreACM + " X " + scoreRM);
                l2.setText("Last Scorer: " + LS);
                if (scoreACM > scoreRM) {
                    W = "AC Milan";
                    l3.setText("Winner: " + W);
                }
                if (scoreACM < scoreRM) {
                    W = "Real Madrid";
                    l3.setText("Winner: " + W);
                }
                if (scoreACM == scoreRM) {
                    W = "DRAW";
                    l3.setText("Winner: " + W);
                }
            }
        });
    }
    // Создаем главный метод для проверки работы программы
    public static void main(String[] args) {
        new FootballMatch().setVisible(true);
    }
}
