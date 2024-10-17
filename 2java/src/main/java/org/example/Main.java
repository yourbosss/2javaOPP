package org.example;

import java.util.Scanner;

import static org.example.Pack.pack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите задачу:\n1 - Button\t2 - Balance\t3 - Bell\t4 - OddEvenSeparate\t5 - Table\t6 - Pack");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                var button = new Button();
                break;
            case 2:
                Balance balance = new Balance(); // Создаем экземпляр весов

                System.out.print("Введите вес для левой чаши: ");
                int leftWeight = scanner.nextInt(); // Считываем вес для левой чаши
                balance.addLeft(leftWeight); // Добавляем вес на левую чашу

                System.out.print("Введите вес для правой чаши: ");
                int rightWeight = scanner.nextInt(); // Считываем вес для правой чаши
                balance.addRight(rightWeight); // Добавляем вес на правую чашу

                System.out.println(balance.result()); // Выводим результат
                break;
            case 3:
                Bell bell = new Bell(); // Создаем экземпляр класса Bell

                // Пример использования: вызываем метод sound несколько раз
                for (int i = 0; i < 10; i++) {
                    System.out.println(bell.sound()); // Печатаем звук
                }
                break;
            case 4:
                OddEvenSeparator separator = new OddEvenSeparator(); // Создаем экземпляр класса

                for (int i = 1; i <= 10; i++) {
                    System.out.print("Введите " + i + " число: ");
                    int number = scanner.nextInt(); // Считываем число от пользователя
                    separator.addNumber(number); // Добавляем число в список
                }

                // Вывод чётных и нечётных чисел
                separator.even(); // Выводим чётные числа
                separator.odd();  // Выводим нечётные числа
                break;
            default:
                System.out.println("Некорректный выбор.");

                break;
            case 5:
                var table = new Table(6, 6);
                System.out.print(table.average() + "\n");
                table.setValue(1,1,100); // проверка поставить значение 100. для 1 стрки первой строчки.
                System.out.print(table.toString());
                System.out.print(table.average());
                scanner.close(); // Закрываем сканер
            case 6:

                pack(); // Вызов метода pack в конце
                break;
            }
        }


    }

