package org.example;

public class arrayMethods {
    public static void swap(Massiv mas, int i, int j) {
        int a = mas.setEl(i);
        mas.getEl(i, mas.setEl(j));
        mas.getEl(j, a);
    }
}
