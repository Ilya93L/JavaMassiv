package org.example;

/**
 * Класс дерева
 */
public class Tree {
    private  Integer key;
    private  Tree left;
    private  Tree right;

    /**
     * Конструктор без параметров
     */
    public Tree()
    {
        key = null;
        left = null;
        right = null;
    }

    /**
     * Конструктор с параметром
     * @param el
     */
    public  Tree(Integer el)
    {
        this();
        key = el;
    }

    /**
     * Добавить элемент в дерево
     * @param el
     */
    public void add(Integer el)
    {
        if(key==null)
            key = el;
            else {
            if (key > el) {
                if(left==null)
                    left = new Tree(el);
                    else left.add(el);
            }
            else {
                if(right==null)
                    right = new Tree(el);
                    else right.add(el);
            }
        }
    }

    /**
     * Вывод дерева
     * @return
     */
    @Override
    public String toString() {
        String str_left = (left!=null)? left.toString() : "";
        String str_right = (right!=null)? right.toString():"";
        return str_left+" "+key.toString()+str_right;
    }

    /**
     * Перевод дерева в отсортированный массив
     * @param array
     * @return
     */
    public Massiv creatMassiv(Massiv array)
    {
        if(left!=null) left.creatMassiv(array);
        array.add(key);
        if(right!=null) right.creatMassiv(array);
        return array;
    }
}
