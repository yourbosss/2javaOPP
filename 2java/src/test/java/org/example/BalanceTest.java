package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BalanceTest {

    @Test
    public void testEqualWeights() {
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(5);

        assertEquals("=", balance.result()); // Проверяем, что результат равен "="
    }

    @Test
    public void testLeftHeavy() {
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);

        assertEquals("L", balance.result()); // Проверяем, что результат равен "L"
    }

    @Test
    public void testRightHeavy() {
        Balance balance = new Balance();
        balance.addLeft(3);
        balance.addRight(7);

        assertEquals("R", balance.result()); // Проверяем, что результат равен "R"
    }

    @Test
    public void testNoWeights() {
        Balance balance = new Balance();

        assertEquals("=", balance.result()); // Проверяем, что результат равен "=" при отсутствии грузов
    }
}