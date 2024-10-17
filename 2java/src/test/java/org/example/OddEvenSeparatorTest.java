package org.example;

import org.example.OddEvenSeparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddEvenSeparatorTest {

    @Test
    public void testAddNumber() {
        OddEvenSeparator separator = new OddEvenSeparator(); // Создаем новый экземпляр OddEvenSeparator

        // Добавляем числа
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);

        // Проверяем, что числа добавлены
        assertEquals(3, separator.numbers.size(), "Ошибка: ожидается 3 числа");
        assertEquals(1, separator.numbers.get(0), "Ошибка: первое число должно быть 1");
        assertEquals(2, separator.numbers.get(1), "Ошибка: второе число должно быть 2");
        assertEquals(3, separator.numbers.get(2), "Ошибка: третье число должно быть 3");
    }

    @Test
    public void testEvenNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator(); // Создаем новый экземпляр OddEvenSeparator

        // Добавляем числа
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);

        // Проверяем чётные числа
        StringBuilder evenNumbers = new StringBuilder();
        for (int number : separator.numbers) {
            if (number % 2 == 0) {
                evenNumbers.append(number).append(" ");
            }
        }

        assertEquals("2 4 ", evenNumbers.toString(), "Ошибка: неверный вывод чётных чисел");
    }

    @Test
    public void testOddNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator(); // Создаем новый экземпляр OddEvenSeparator

        // Добавляем числа
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);

        // Проверяем нечётные числа
        StringBuilder oddNumbers = new StringBuilder();
        for (int number : separator.numbers) {
            if (number % 2 != 0) {
                oddNumbers.append(number).append(" ");
            }
        }

        assertEquals("1 3 ", oddNumbers.toString(), "Ошибка: неверный вывод нечётных чисел");
    }
}
