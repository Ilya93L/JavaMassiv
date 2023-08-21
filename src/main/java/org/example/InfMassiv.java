package org.example;

/**
 * Интерфейс InfMassiv
 * Методы InfMassiv:
 *  InfMassiv.setEl(int index)  - вызвать элемент массива
 *  InfMassiv.getEl(int index,int el); - задать элемент массива
 *  InfMassiv.getSize() - вызвать размерность массива
 *  InfMassiv.toString() - вывод массива
 *  InfMassiv.RestartParam() - автоматически перезадать элементы массива
 *  InfMassiv.add(int al) - добавить элемент к массиву
 */
public interface InfMassiv
{
    /**
     * Вызвать элемент массива
     * @param index - индекс элемента массива
     * @return - возвращает index элемент массива
     */
    public int setEl(int index);    //вызвать элемент index

    /**
     * Задать элемент массива
     * @param index - индекс элемента массива
     * @param el - параметр для заменты элементы массива
     */
    public void getEl(int index,int el); //ввод элемента index

    /**
     * Вызвать размерность массива
     * @return - возвращение текущей размерности массива
     */
    public int getSize();   //получить размер

    /**
     * Вывод элементов массива
     * @return - строка с элементами массива
     */
    public String toString();   //вывод массива

    /**
     * Автоматическое переопределение параметров массива
     */
    public void RestartParam(); //переопределить параметры массива

    /**
     * Добавить новый элемент в массив
     * @param al - значение параметра
     */
    public  void add(int al);   //добавить элемент в массив
}
