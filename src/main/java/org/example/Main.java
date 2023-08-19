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
        Massiv<Integer> mas1 = new Massiv();
        Massiv<Integer> mas2 = new Massiv(15);
        PrintMas("Массив 1:",mas1); PrintMas("Массив 2:",mas2);

        mas1.RestartParam();
        mas2.RestartParam();

        PrintMas("Массив 1 Инициализация параметров:",mas1); PrintMas("Массив 2 Инииализация параметров:",mas2);
        ArrayList<Integer> mas;
    }
}