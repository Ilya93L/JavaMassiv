package org.example;

/**
 * Класс Search методов поиска для одномерного массива класса {@link Massiv}<p>
 * Методы:
 */
public class Search {
    /**
     * Алгоритм последовательного поиска
     * @param array - массив целых чисел
     * @param el - искомый элемент
     * @return - индекс искомого элемента
     */
    public static int SequentialSearch(Massiv array, int el)
    {
        int i;
        for(i=0;i<array.getSize();i++)
            if(array.getEl(i)==el) return i;
        return array.getSize()+1;
    }

    /**
     * Алгоритм логарифмического(бинарного) поиска
     * @param array - массив целых чисел
     * @param el - искомый элемент
     * @return - индекс искомого элемента
     */
    public static  int BinarySearch(Massiv array, int el)
    {
        int left = 0;
        int right= array.getSize();
        while (true)
        {
            int median = (right+left)/2;
            if(array.getEl(median)==el) return median;
            if(median==1) break;
            if(array.getEl(median)<el)
            {
                left = median;
            }else{
                right=median;
            }
        }
        return array.getSize()+1;
    }

}
