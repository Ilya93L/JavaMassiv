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
    public int SequentialSearch(Massiv array, int el)
    {
        return array.getSize()+1;
    }

    /**
     * Алгоритм логарифмического(бинарного) поиска
     * @param array - массив целых чисел
     * @param el - искомый элемент
     * @return - индекс искомого элемента
     */
    public int BinarySearch(Massiv array, int el)
    {
        return array.getSize()+1;
    }

}
