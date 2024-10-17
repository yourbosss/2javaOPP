package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BellTest {

    @Test
    public void testSound() {
        Bell bell = new Bell(); // Создаем экземпляр класса Bell

        StringBuilder output = new StringBuilder();

        // Вызываем метод sound 10 раз и собираем результаты
        for (int i = 0; i < 10; i++) {
            output.append(bell.sound()).append("\n");
        }

        // Ожидаемый результат: "ding" и "dong" попеременно
        String expectedOutput = "ding\ndong\nding\ndong\nding\ndong\nding\ndong\nding\ndong";

        assertEquals(expectedOutput, output.toString().trim()); // Проверяем, что вывод соответствует ожидаемому
    }
}
