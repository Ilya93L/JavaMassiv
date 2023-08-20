package org.example;

public class Sorting {
    private static void Swap(Massiv mas, int i, int j){
        int a = mas.setEl(i);
        mas.getEl(i,mas.setEl(j));
        mas.getEl(j,a);
    }
    //Сортировка пузырьком / Bubble Sort O(n^2)
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
    public  static void ShakerSort(Massiv array)
    {
        int end = array.getSize()-1;
        int beg = -1;
        boolean flg =true;
        while(flg)
        {
            flg = false;
            beg++;
            for(int i=beg;i<end;i++)
            {
                if(array.setEl(i)>array.setEl(i+1)) {
                    Swap(array,i,(i+1));
                    flg =true;
                }
            }
            if(flg!=true) break;
            end--;
            for(int i=end;i>beg;i--)
            {
                if(array.setEl(i)<array.setEl(i-1)) {
                    Swap(array,i,(i-1));
                    flg =true;
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
