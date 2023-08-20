package org.example;

public class Sorting {
    //Сортировка пузырьком / Bubble Sort
    public static void BubbleSort(Massiv array) {
        int a;
        for(int i=0;i<array.getSize();i++)
            for(int j=i+1;j< array.getSize();j++)
                if (array.setEl(i)<array.setEl(j)) {
                    a = array.setEl(i);
                    array.getEl(i,array.setEl(j));
                    array.getEl(j,a);
                }
    }
    //Коктельная сортировка / Shaker sort
    public  static void ShakerSort(Massiv array)
    {

    }
    //Сортировка расчесткой / Comb sort
    public static void CombSort(Massiv array)
    {

    }
    //Сортировка вставками / Insertion sort
    public  static void InsertionSort(Massiv array)
    {

    }
    //Сортировка Шелла / Shellsort
    public static void ShellSort(Massiv array)
    {

    }
    //Сортировка деревом / Tree sort
    public static  void TreeSort(Massiv array)
    {

    }
    //Быстрая сортировка / Quicksort
    public static void QuickSort(Massiv array)
    {

    }
}
