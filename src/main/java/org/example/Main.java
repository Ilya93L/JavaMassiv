package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void PrintMas(String str,Massiv ms)
    {
        System.out.println(str);
        System.out.println(ms);
    }
    public static void main(String[] args){
        System.out.println("-ARRAY-");
        int key;
        boolean flg=true;
        Scanner sc = new Scanner(System.in);
        Massiv mas = new Massiv();
        while(flg) {
            System.out.println(" 1 - Вывод массива");
            System.out.println(" 2 - Инициализировать массив случайными числами");
            System.out.println(" 3 - Ввести свой массив");
            System.out.println(" 4 - Считать массив из файла");
            System.out.println(" 5 - Перемешать элементы массива");
            System.out.println(" 6 - Сортировка массива");
            System.out.println(" 7 - Поиск в массиве");
            System.out.println(" 8 - Бинарное дерево из массива");
            System.out.println(" 0 - Выход");
            System.out.print("Введите ключ управления:"); key = sc.nextInt();
            switch (key) {
                case 1 -> {
                    System.out.println(mas);
                    sc.nextLine();sc.nextLine();
                }
                case  2-> {
                    mas.RestartParam();
                    System.out.println(mas);
                    sc.nextLine();sc.nextLine();
                }
                case 3 , 4 , 5, 6 , 7 , 8->{
                    System.out.println("- в разработке - ");
                    sc.nextLine();sc.nextLine();
                }
                case 0 -> {
                    System.out.println("- Выход - ");
                    sc.nextLine();sc.nextLine();
                    flg =false;
                }
                default -> {
                    System.out.println("- Не верный ввод команды");sc.nextLine();sc.nextLine();
                }
            }
        }
    }
}