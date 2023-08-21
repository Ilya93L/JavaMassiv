package org.example;

import java.util.List;

/**
 * Класс Sorting для различных типов сортировок одномерного массива
 * Методы:
 *  Sorting.BubbleSort()
 *  Sorting.ChakerSort()
 */
public class Sorting {
    /**
     * Скрытый метод для передачи значений между двумя элементами массива
     * @param mas (исходный массив)
     * @param i (первый элемент)
     * @param j (второй элемент)
     */
    private static void Swap(Massiv mas, int i, int j){
        int a = mas.setEl(i);
        mas.getEl(i,mas.setEl(j));
        mas.getEl(j,a);
    }
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
                    Swap(array,i,j);
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
                    Swap(array,i,(i+1));
                }
            }
            end--;
            for(int i=end;i>beg;i--)
            {
                if(array.setEl(i)<array.setEl(i-1)) {
                    Swap(array,i,(i-1));
                }
            }

        }
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
