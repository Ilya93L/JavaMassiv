package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("-ARRAY-");
        int key;        //Ключ управления в меню
        boolean flg = true; //Параметр продолжения цикла
        Scanner sc = new Scanner(System.in);   //Параметр для ввода данных из окна консоли
        Massiv mas = new Massiv(); //Определение объекта массива
        while(flg) {
            System.out.println(" 1 - Вывод массива");                                   //  +
            System.out.println(" 2 - Инициализировать массив случайными числами");      //  +
            System.out.println(" 3 - Ввести свой массив");                              //  +
            System.out.println(" 4 - Считать массив из файла");                         //  +
            System.out.println(" 5 - Перемешать элементы массива");                     //  +
            System.out.println(" 6 - Сортировка массива");                              //  +-
            System.out.println(" 7 - Поиск в массиве");                                 //
            System.out.println(" 8 - Бинарное дерево из массива");                      //
            System.out.println(" 0 - Выход");                                           //  +
            System.out.print("Введите ключ управления:"); key = sc.nextInt();
            switch (key) {
                case 1 -> {
                    System.out.println(mas);    //Вывод массива
                }
                case  2-> {
                    mas.restartParam();
                    System.out.println(mas);    //Вывод массива
                }
                case 3->{                       //Ввод собственного массива
                    System.out.print("Введите размерность массива:");
                    int size_array = sc.nextInt();   //ввод размерности массива
                    mas = new Massiv(size_array);
                    for(int i=0;i<size_array;i++)
                    {
                        System.out.printf("Введите элемент массива [%d]:=",i);
                        mas.setEl(i, sc.nextInt());
                    }
                    System.out.println(mas);
                }
                case 4 ->{                      //Ввод массива из файла
                    String filename;
                    System.out.print("Введите название файла:"); filename=sc.next();
                    try( Scanner read = new Scanner(new File(filename))){
                    mas = new Massiv(0);
                    while (read.hasNextLine())
                        mas.add(read.nextInt());
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    System.out.println(mas);
                }
                case 7 , 8->{
                    System.out.println("- в разработке - ");
                }
                case 5->{
                    System.out.println("Перемешать элементы массива");
                    System.out.println(mas);
                    mas.rndParamPos();
                    System.out.println(mas);
                }
                case 6 -> {
                    System.out.println("Сортировки - Исходный массив:");    System.out.println(mas);

                    System.out.println("Сортировка пузырьком / Bubble Sort O(n^2)");
                    Massiv buf = new Massiv(mas);
                    long time = System.currentTimeMillis();     Sorting.BubbleSort(buf);    long timeend = System.currentTimeMillis();
                    long timeBubbleSort = timeend-time;
                    System.out.println(buf);

                    System.out.println("Коктельная сортировка / Shaker sort O(n^2)");
                    buf = mas.clone();
                    time = System.currentTimeMillis();  Sorting.ShakerSort(buf);    timeend = System.currentTimeMillis();
                    long timeShakerSort = timeend-time;
                    System.out.println(buf);

                    System.out.println("Сортировка расческой / Comb sort O(n log n)");
                    buf = mas.clone();
                    time = System.currentTimeMillis();  Sorting.CombSort(buf);    timeend = System.currentTimeMillis();
                    long timeCombSort = timeend-time;
                    System.out.println(buf);

                    System.out.println("Сортировка вставками / Insertion sort O(n^2)");
                    buf = mas.clone();
                    time = System.currentTimeMillis();  Sorting.InsertionSort(buf);    timeend = System.currentTimeMillis();
                    long timeInsertionSort = timeend-time;
                    System.out.println(buf);

                    System.out.println("Сортировка Шелла / Shell sort O(n^2)");
                    buf = mas.clone();
                    time = System.currentTimeMillis();  Sorting.ShellSort(buf);    timeend = System.currentTimeMillis();
                    long timeShellSort = timeend-time;
                    System.out.println(buf);

                    System.out.println("Сортировка Деревом / Tree sort O(n^2)");
                    buf = mas.clone();
                    time = System.currentTimeMillis();  Sorting.TreeSort(buf);    timeend = System.currentTimeMillis();
                    long timeTreeSort = timeend-time;
                    System.out.println(buf);

                    System.out.println("Время работы пузырьковой сортировки :"+timeBubbleSort);
                    System.out.println("Время работы шейкерной сортировки   :"+timeShakerSort);
                    System.out.println("Время работы сортировки расческой   :"+timeCombSort);
                    System.out.println("Время работы сортировки вставками   :"+timeInsertionSort);
                    System.out.println("Время работы сортировки Шелла       :"+timeShellSort);
                    System.out.println("Время работы сортировки Деревом       :"+timeTreeSort);
                }
                case 0 -> {
                    System.out.println("- Выход - ");
                    flg = false;
                }
                default -> {
                    System.out.println("- Не верный ввод команды");
                }
            }
            sc.nextLine();sc.nextLine();    //Приостановка перед выводом меню
        }
    }
}