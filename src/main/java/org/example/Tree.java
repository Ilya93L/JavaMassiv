package org.example;

import java.beans.PropertyEditorSupport;

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

    private int getDeepTree(int deep)
    {
        int deep_left = (this.left!=null)?this.left.getDeepTree(deep+1):deep;
        int deep_right = (this.right!=null)?this.right.getDeepTree(deep+1):deep;
        return Math.max(deep_right,deep_left);
    }
    private void arrayDeep(Massiv[]array,int deep)
    {
        array[deep].add(this.key);
        if(this.left!=null) this.left.arrayDeep(array,deep+1);
        if(this.right!=null) this.right.arrayDeep(array,deep+1);
    }
    private static String stringTab(int count) {
        String result = "";
        for (int i = 0; i < count; i++) result += "\t";
        return result;
    }
    private  void arrayStringTree(String[]array,int deep,int count)
    {
        Integer a = this.key;
        array[deep]+=stringTab(count)+a.toString();
        if(this.left!=null) this.left.arrayStringTree(array,deep+1,count/2);
        if(this.right!=null) this.right.arrayStringTree(array,deep+1,(count/2)+count/2);
    }
    public String toStringTree()
    {
        int deep_left = (this.left!=null)?this.getDeepTree(1):1;
        int deep_right = (this.right!=null)?this.getDeepTree(1):1;
        int deep = Math.max(deep_right,deep_left);

        String [] arrayStr = new String[deep];
        for(int i=0;i<deep;i++)arrayStr[i]="";
        this.arrayStringTree(arrayStr,0,deep*2);

        String result = "";
        for(int i=0;i<deep;i++)
            result = result+arrayStr[i]+"\n";
        return result;
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
