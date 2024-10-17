package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    private int clickCount; // Счетчик нажатий
    private JButton button; // Кнопка

    // Конструктор класса
    public Button() {
        clickCount = 0; // Инициализация счетчика нажатий
        createAndShowGUI(); // Создание и отображение графического интерфейса
    }

    // Метод для создания графического интерфейса
    private void createAndShowGUI() {
        JFrame frame = new JFrame("Кнопка"); // Создаем окно
        button = new JButton("Нажми меня!"); // Создаем кнопку

        // Добавляем обработчик нажатия кнопки
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incrementClickCount(); // Обработка нажатия кнопки
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие приложения при закрытии окна
        frame.getContentPane().add(button); // Добавляем кнопку в окно
        frame.setSize(300, 200); // Устанавливаем размер окна
        frame.setVisible(true); // Делаем окно видимым
    }

    // Метод для увеличения счетчика нажатий
    public void incrementClickCount() {
        clickCount++; // Увеличиваем счетчик нажатий
        System.out.println("Количество нажатий: " + clickCount); // Выводим текущее количество нажатий
    }

    // Метод для получения текущего количества нажатий
    public int getClickCount() {
        return clickCount; // Возвращаем текущее количество нажатий
    }
}
