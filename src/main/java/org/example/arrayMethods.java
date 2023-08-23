package org.example;

/**
 * Класс  методов работы с массивом класса {@link Massiv}<p>
 * <a>Методы класса:</a>
 * @see arrayMethods#swap(Massiv,int,int) swap(Massiv,int,int) <a> - метод перестановки двух элементов массива</a>
 */
public class arrayMethods {
    public static void swap(Massiv mas, int i, int j) {
        int a = mas.getEl(i);
        mas.setEl(i, mas.getEl(j));
        mas.setEl(j, a);
    }
}
