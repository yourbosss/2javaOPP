package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonTest {

    @Test
    public void testIncrementClickCount() {
        Button buttonApp = new Button(); // Создаем новый экземпляр Button

        // Проверяем начальное значение счетчика нажатий
        assertEquals(0, buttonApp.getClickCount());

        // Симулируем нажатие кнопки
        buttonApp.incrementClickCount(); // Нажимаем кнопку
        assertEquals(1, buttonApp.getClickCount()); // Проверяем, что количество нажатий увеличилось

        buttonApp.incrementClickCount(); // Нажимаем кнопку еще раз
        assertEquals(2, buttonApp.getClickCount()); // Проверяем, что количество нажатий увеличилось снова
    }
}
