package org.example.geometry3d;

import org.example.geometry2d.Figure;

public class Cylinder {
    private Figure base;  // Основание цилиндра (фигура)
    private double height; // Высота цилиндра

    public Cylinder(Figure base, double height) {
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height; // Объем цилиндра
    }

    @Override
    public String toString() {
        return STR."Cylinder(base=\{base.toString()}, height=\{height})";
    }
}