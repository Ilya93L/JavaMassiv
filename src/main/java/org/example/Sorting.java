package org.example;

import java.util.List;

/**
 * Класс Sorting для различных типов сортировок одномерного массива класса {@link Massiv}<p>
 * Методы:
 * @see Sorting#BubbleSort(Massiv) BubbleSort(Massiv) <a> - Пузырьковая сортировка O(n^2)</a>
 * @see Sorting#ShakerSort(Massiv) ChakerSort(Massiv) <a> - Шейкерная сортировка O(n^2)</a>
 * @see Sorting#CombSort(Massiv) CombSort(Massiv)      <a> - Сортировка расческой O(n log n)</a>
 * @see Sorting#InsertionSort(Massiv) InsertionSort(Massiv) <a> - Сортировка вставками O(n^2)</a>
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

    /**
     * Сортировка расческой / Comb sort O(n log n)
     * @param array - Сортируемый массив
     */
    public static void CombSort(Massiv array)
    {
        int size = array.getSize()-1;
        boolean flg =true;
        while(flg)
        {
            for(int i=0;(i+size)<array.getSize();i++)
                if(array.setEl(i)>array.setEl(i+size))
                    arrayMethods.swap(array,i,(i+size));
            if((size/1.247)>1)
                size/=1.247;
            else flg =false;
        }
    }

    /**
     * Сортировка вставками / Insertion sort O(n^2)
     * @param array - Сортируемый массив
     */
    public  static void InsertionSort(Massiv array)
    {
        for(int i=1; i<array.getSize(); i++) // -> от 0 до n
        {
            //int a = array.setEl(i);
            int j;
            for(j=i; j>0; j--)       // от текущего элемента i до 0
                if(array.setEl(j)<array.setEl(j-1))
                    arrayMethods.swap(array,j,j-1);
                    else break;

            /*for(int k=i-1;k>j;k--)  //от i элемента до меньшего элемента в массиве j
                array.getEl(k+1,array.setEl(k));
            array.getEl(j+1,a);*/
        }
    }
    //Сортировка Шелла / Shellsort
    public static void ShellSort(Massiv array)
    {
        for(int step = array.getSize()/2;step>0;step/=2) {
            for (int i = step; i < array.getSize(); i++)
            {
                int a = array.setEl(i);
                int j;
                for (j = i; j >=step; j-=step)
                {
                    if(a<array.setEl(j-step))
                        array.getEl(j,array.setEl(j-step));
                        else break;
                }
                array.getEl(j, a);
            }
        }
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
