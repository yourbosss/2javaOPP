package org.example;

import java.util.Scanner;


public class Balance {
    private int leftWeight;  // Вес на левой чаше
    private int rightWeight; // Вес на правой чаше

    // Конструктор класса
    public Balance() {
        leftWeight = 0;  // Инициализация веса на левой чаше
        rightWeight = 0; // Инициализация веса на правой чаше
    }

    // Метод для добавления веса на левую чашу
    public void addLeft(int weight) {
        if (weight <= 0) { // Проверка на положительное значение веса
            throw new IllegalArgumentException("Вес должен быть положительным и больше нуля.");
        }
        leftWeight += weight; // Увеличиваем вес на левой чаше
    }

    // Метод для добавления веса на правую чашу
    public void addRight(int weight) {
        if (weight <= 0) { // Проверка на положительное значение веса
            throw new IllegalArgumentException("Вес должен быть положительным и больше нуля.");
        }
        rightWeight += weight; // Увеличиваем вес на правой чаше
    }

    // Метод для определения положения чаш и вывода результата
    public String result() {
        if (leftWeight == rightWeight) {
            return "="; // Чаши уравновешены
        } else if (leftWeight > rightWeight) {
            return "L"; // Левый перевес
        } else {
            return "R"; // Правый перевес
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для ввода данных
        Balance balance = new Balance(); // Создаем экземпляр весов

        try {
            System.out.print("Введите вес для левой чаши: ");
            int leftWeight = scanner.nextInt(); // Считываем вес для левой чаши
            balance.addLeft(leftWeight); // Добавляем вес на левую чашу

            System.out.print("Введите вес для правой чаши: ");
            int rightWeight = scanner.nextInt(); // Считываем вес для правой чаши
            balance.addRight(rightWeight); // Добавляем вес на правую чашу

            System.out.println(balance.result()); // Выводим результат
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage()); // Обработка исключения
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage()); // Общая обработка ошибок ввода
        } finally {
            scanner.close(); // Закрываем сканер в любом случае
        }
    }
}