package org.example.geometry2d;
import org.example.exceptions.NegativeDimensionException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws NegativeDimensionException {
        if (radius <= 0) {
            throw new NegativeDimensionException("Radius must be greater than zero.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Площадь круга
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Периметр круга
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle(radius=" + radius + ")";
    }
}