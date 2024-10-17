package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableTest {

    @Test
    public void testSetValueAndGetValue() {
        Table table = new Table(3, 3); // Создаем новый экземпляр Table

        // Устанавливаем значение в ячейку (1, 1)
        table.setValue(1, 1, 42);

        // Проверяем, что значение в ячейке (1, 1) равно 42
        assertEquals(42, table.getValue(1, 1), "Ошибка: значение в ячейке (1, 1) должно быть 42");
    }

    @Test
    public void testAverage() {
        Table table = new Table(2, 2); // Создаем новый экземпляр Table

        // Устанавливаем значения
        table.setValue(0, 0, 10);
        table.setValue(0, 1, 20);
        table.setValue(1, 0, 30);
        table.setValue(1, 1, 40);

        // Проверяем среднее арифметическое
        assertEquals(25.0, table.average(), "Ошибка: среднее арифметическое должно быть 25.0");
    }

    @Test
    public void testToString() {
        Table table = new Table(2, 2); // Создаем новый экземпляр Table

        // Устанавливаем значения
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);

        // Проверяем строковое представление таблицы
        String expectedOutput = "[1, 2]\n[3, 4]";
        assertEquals(expectedOutput, table.toString(), "Ошибка: строковое представление таблицы неверно");
    }

    @Test
    public void testRowsAndCols() {
        Table table = new Table(4, 5); // Создаем новый экземпляр Table

        // Проверяем количество строк и столбцов
        assertEquals(4, table.rows(), "Ошибка: количество строк должно быть 4");
        assertEquals(5, table.cols(), "Ошибка: количество столбцов должно быть 5");
    }
}
