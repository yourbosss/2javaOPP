package org.example;
import org.example.geometry2d.Circle;
import org.example.geometry2d.Figure;
import org.example.geometry2d.Rectangle;
import org.example.geometry3d.Cylinder;
import org.example.exceptions.NegativeDimensionException;
import java.util.Scanner;

public class Pack {

    static void pack() { // Метод для выполнения основной логики программы
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для ввода данных

        try {
            // Ввод радиуса круга
            System.out.print("Введите радиус круга: ");
            double circleRadius = scanner.nextDouble();

            // Проверка на нулевой и отрицательный радиус
            if (circleRadius <= 0) {
                throw new NegativeDimensionException("Radius must be greater than zero.");
            }

            Circle circle = new Circle(circleRadius);

            // Ввод размеров прямоугольника
            System.out.print("Введите ширину прямоугольника: ");
            double rectangleWidth = scanner.nextDouble();
            System.out.print("Введите высоту прямоугольника: ");
            double rectangleHeight = scanner.nextDouble();

            // Проверка на отрицательные размеры прямоугольника
            if (rectangleWidth < 0 || rectangleHeight < 0) {
                throw new NegativeDimensionException("Width and height cannot be negative.");
            }

            Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);

            // Ввод высоты цилиндра
            System.out.print("Введите высоту цилиндра: ");
            double cylinderHeight = scanner.nextDouble();

            // Прямое приведение к Figure
            Cylinder cylinder = new Cylinder((Figure) circle, cylinderHeight);

            // Вывод информации о фигурах
            System.out.println("Круг: " + circle);
            System.out.println("Площадь круга: " + circle.area());
            System.out.println("Периметр круга: " + circle.perimeter());

            System.out.println("Прямоугольник: " + rectangle);
            System.out.println("Площадь прямоугольника: " + rectangle.area());
            System.out.println("Периметр прямоугольника: " + rectangle.perimeter());

            System.out.println("Цилиндр: " + cylinder);
            System.out.println("Объем цилиндра: " + cylinder.volume());

        } catch (NegativeDimensionException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close(); // Закрываем сканер в блоке finally
        }
    }
}