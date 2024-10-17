package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenSeparator {
    List<Integer> numbers; // Список для хранения добавленных чисел

    // Конструктор класса
    public OddEvenSeparator() {
        numbers = new ArrayList<>(); // Инициализация списка
    }

    // Метод для добавления числа
    public void addNumber(int number) {
        numbers.add(number); // Добавляем число в список
    }

    // Метод для вывода чётных чисел
    public void even() {
        System.out.print("Чётные числа: ");
        for (int number : numbers) {
            if (number % 2 == 0) { // Проверка на чётность
                System.out.print(number + " "); // Печатаем чётные числа
            }
        }
        System.out.println(); // Переход на новую строку
    }

    // Метод для вывода нечётных чисел
    public void odd() {
        System.out.print("Нечётные числа: ");
        for (int number : numbers) {
            if (number % 2 != 0) { // Проверка на нечётность
                System.out.print(number + " "); // Печатаем нечётные числа
            }
        }
        System.out.println(); // Переход на новую строку
    }

    public static void main(String[] args) {
        OddEvenSeparator separator = new OddEvenSeparator(); // Создаем экземпляр класса
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для ввода данных

        for (int i = 1; i <= 10; i++) {
            System.out.print("Введите " + i + " число: ");
            int number = scanner.nextInt(); // Считываем число от пользователя
            separator.addNumber(number); // Добавляем число в список
        }

        // Вывод чётных и нечётных чисел
        separator.even(); // Выводим чётные числа
        separator.odd();  // Выводим нечётные числа

        scanner.close(); // Закрываем сканер
    }
}