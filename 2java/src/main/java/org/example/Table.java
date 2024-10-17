package org.example;

import java.util.Arrays;

public class Table {
    private int[][] data; // Двумерный массив для хранения значений
    private int rows; // Количество строк
    private int cols; // Количество столбцов

    // Конструктор класса
    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
        var count = 0;
        for (int i = 0; i < rows; i++) {
            // Инициализация двумерного массива нулями
            for (int j = 0; j < cols; j++) {
                data[i][j] = count;
                count++;
            }
        }
    }

    // Метод для получения значения из ячейки
    public int getValue(int row, int col) {
        return data[row][col]; // Возвращаем значение из указанной ячейки
    }

    // Метод для установки значения в ячейку
    public void setValue(int row, int col, int value) {
        data[row][col] = value; // Устанавливаем значение в указанной ячейке
    }

    // Метод для получения количества строк
    public int rows() {
        return rows; // Возвращаем количество строк
    }

    // Метод для получения количества столбцов
    public int cols() {
        return cols; // Возвращаем количество столбцов
    }

    // Метод для преобразования таблицы в строку
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            sb.append(Arrays.toString(row)).append("\n"); // Добавляем каждую строку в строку результата
        }
        return sb.toString().trim(); // Возвращаем строку без лишних пробелов
    }

    // Метод для вычисления среднего арифметического всех значений таблицы
    public double average() {
        double sum = 0;
        int count = 0;

        for (int[] row : data) {
            for (int value : row) {
                sum += value; // Суммируем значения
                count++; // Увеличиваем счетчик значений
            }
        }

        return count == 0 ? 0 : sum / count; // Возвращаем среднее значение, если есть элементы
    }

    public static void main(String[] args) {
        var table = new Table(6, 6);
        System.out.print(table.average() + "\n");
        table.setValue(1,1,100); // проверка поставить значение 100. для 1 стрки первой строчки.
        System.out.print(table.toString());
        System.out.print(table.average());
    }
}