package org.example;


public class Bell {
    private int count; // Счетчик для определения, какой звук печатать

    // Конструктор класса
    public Bell() {
        count = 0; // Инициализация счетчика
    }

    // Метод для получения звука
    public String sound() {
        count++; // Увеличиваем счетчик
        return (count % 2 == 1) ? "ding" : "dong"; // Возвращаем "ding" или "dong"
    }
}