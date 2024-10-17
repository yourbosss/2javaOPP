package org.example;
import org.example.exceptions.NegativeDimensionException;
import org.example.geometry2d.Circle;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class PackTest {

    @Test
    public void testValidRadius() throws NegativeDimensionException {
        Circle circle = new Circle(5); // Создаем новый экземпляр Circle с радиусом 5
        assertEquals(5, circle.getRadius(), "Ошибка: радиус должен быть 5");
    }

    @Test
    public void testAreaCalculation() throws NegativeDimensionException {
        Circle circle = new Circle(5);
        double expectedArea = Math.PI * 5 * 5; // Ожидаемая площадь
        assertEquals(expectedArea, circle.area(), "Ошибка: площадь круга рассчитана неверно");
    }

    @Test
    public void testPerimeterCalculation() throws NegativeDimensionException {
        Circle circle = new Circle(5);
        double expectedPerimeter = 2 * Math.PI * 5; // Ожидаемый периметр
        assertEquals(expectedPerimeter, circle.perimeter(), "Ошибка: периметр круга рассчитан неверно");
    }
}