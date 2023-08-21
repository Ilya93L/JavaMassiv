package org.example;

/**
 * Интерфейс InfMassiv
 *  @see InfMassiv#setEl(int) setEl(int index) <a> - получить элемент массива с номером index"</a>
 *  @see InfMassiv#getEl(int, int)  getEl(int index,int el) <a> - задать элемент с номером index параметров el"</a>
 *  @see InfMassiv#getSize()  getSize() <a> - получить текущую размерность массива"</a>
 *  @see InfMassiv#toString()  toString() <a> - получить строку вывода элементов массива"</a>
 *  @see InfMassiv#restartParam()  restartParam() <a> - переопределение всех элементов в массиве случайными числами"</a>
 *  @see InfMassiv#add(int)  add(int al) <a> - добавить новый элемент в массив"</a>
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
    public void restartParam(); //переопределить параметры массива

    public void rndParamPos();//переопределить позиции элементов в массиве
     /**
     * Добавить новый элемент в массив
     * @param al - значение параметра
     */
    public  void add(int al);   //добавить элемент в массив
}

