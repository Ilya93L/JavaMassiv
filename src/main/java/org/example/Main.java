package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void PrintMas(String str,Massiv ms)
    {
        System.out.println(str);
        System.out.println(ms);
    }
    public static void main(String[] args) {
        System.out.println("HW");
        Massiv mas1 = new Massiv();
        Massiv mas2 = new Massiv(15);
        PrintMas("Массив 1:",mas1); PrintMas("Массив 2:",mas2);

        mas1.RestartParam();
        mas2.RestartParam();

        PrintMas("Массив 1 Инициализация параметров:",mas1); PrintMas("Массив 2 Инииализация параметров:",mas2);

        Massiv mas3 = mas2.clone();
        PrintMas("Массив 3 Инииализация параметров:",mas2);

        System.out.println("Сравнение массива 1 и 2:"+mas1.equals(mas2));
        System.out.println("Сравнение массива 1 и 3:"+mas1.equals(mas3));
        System.out.println("Сравнение массива 3 и 2:"+mas3.equals(mas2));
    }
}