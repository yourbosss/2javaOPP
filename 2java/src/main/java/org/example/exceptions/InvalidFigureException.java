package org.example.exceptions;

public class InvalidFigureException extends Exception { // Унаследуйте от Exception
    public InvalidFigureException(String message) {
        super(message); // Вызов конструктора родительского класса
    }
}