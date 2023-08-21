package org.example;

import java.util.List;

/**
 * Класс Sorting для различных типов сортировок одномерного массива класса {@link Massiv}<p>
 * Методы:
 * @see Sorting#BubbleSort(Massiv) BubbleSort(Massiv) <a> - Пузырьковая сортировка O(n^2)</a>
 * @see Sorting#ShakerSort(Massiv) ChakerSort(Massiv) <a> - Шейкерная сортировка O(n^2)</a>
 * @see Sorting#CombSort(Massiv) CombSort(Massiv)      <a> - Сортировка расческой O(n log n)</a>
 * @see Sorting#InsertionSort(Massiv) InsertionSort(Massiv) <a> - </a>
 * @see Sorting#ShellSort(Massiv) ShellSort(Massiv) <a> - </a>
 * @see Sorting#TreeSort(Massiv) TreeSort(Massiv) <a> - </a>
 * @see Sorting#QuickSort(Massiv) QuickSort(Massiv) <a> - </a>
 */
public class Sorting {
    /**
     * Сортировка массива пузырьковой сортировкой /Bubble Sort
     * O(n^2)
     * @param array - сортируемый массив
     */
    public static void BubbleSort(Massiv array) {
        int i=0;
        boolean flg = true;
        while(flg) {
            flg=false;
            for (int j = i + 1; j < array.getSize(); j++)
                if (array.setEl(i) > array.setEl(j)) {
                    arrayMethods.swap(array,i,j);
                    flg =true;
                }
            i++;
        }
    }
    //Коктельная сортировка / Shaker sort O(n^2)

    /**
     * Сортировка массива шейкерной сортировкой / Shaker Sort O(n^2)
     * @param array - сортируемый массив
     */
    public  static void ShakerSort(Massiv array)
    {

        int end = array.getSize()-1;
        int beg = -1;
        boolean flg =true;
        while(end>beg)
        {
            beg++;
            for(int i=beg;i<end;i++)
            {
                if(array.setEl(i)>array.setEl(i+1)) {
                    arrayMethods.swap(array,i,(i+1));
                }
            }
            end--;
            for(int i=end;i>beg;i--)
            {
                if(array.setEl(i)<array.setEl(i-1)) {
                    arrayMethods.swap(array,i,(i-1));
                }
            }

        }
    }
    //Сортировка расческой / Comb sort O(n log n)
    public static void CombSort(Massiv array)
    {
        int size = array.getSize()-1;
        while(size>1)
        {
            for(int i=0;(i+size)<array.getSize();i++)
                if(array.setEl(i)>array.setEl(i+size))
                    arrayMethods.swap(array,i,(i+size));
            size/=1.247;
        }
        Sorting.BubbleSort(array);
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
