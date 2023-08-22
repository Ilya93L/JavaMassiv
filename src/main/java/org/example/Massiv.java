package org.example;


import java.util.stream.Stream;

/**
 * Класс Massiv - представление массива целых чисел простого типа int <p>
 * Методы класса Massiv:
 * @see Massiv#add(int) 
 * @see Massiv#getSize() 
 * @see Massiv#getEl(int, int) 
 * @see Massiv#setEl(int) 
 * @see Massiv#toString() 
 * @see Massiv#equals(Massiv) 
 * @see Massiv#restartParam() 
 * @see Massiv#rndParamPos() 
 * @see Massiv#IndexBounds(int)
 */
public class Massiv implements InfMassiv {

    private  int mas[];         //Массив
    private int size = 1115;//_000;   //Размер массива

    private boolean IndexBounds(int index)  //проверка выхода за границы массива
    {
        if((this.size<index)||(index<0))
        {
            System.err.printf("Ошибка: Индекс %d не входит в границы массива\n",index);
            return false;
        }return  true;
    }
    public Massiv() {
        mas = new int[size];
    }   //конструктор без параметров

    public Massiv(int size) {
        this.size = size;
        mas = new int[size];
    }
    public Massiv(Massiv masObj)
    {
        this.size = masObj.getSize();
        this.mas = new int[this.size];
        for(int i=0;i<masObj.getSize();i++) this.getEl(i,masObj.setEl(i));
    }
    @Override
    public int setEl(int index){
        if(this.IndexBounds(index))
        return this.mas[index]; else return 0;
    }

    @Override
    public void getEl(int index,int el) {
        if(this.IndexBounds(index))
        this.mas[index] = el;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        for (Object a : mas) res.append(" " + a);
        return res.toString();
    }

    @Override
    public void restartParam() {
        for (int i = 0; i < size; i++)
            mas[i] = (int) (Math.random() * 100 + 1) - (int)(Math.random()*100+1);
    }

    @Override
    public void rndParamPos() {
        for (int i=0;i<this.size;i++)
        {
            int j = (int)(Math.random()*this.size)%this.size;
            arrayMethods.swap(this,i,j);
        }
    }


    @Override
    public void add(int al) {
        int mas[] = new int[this.size+1];
        for(int i=0;i<this.size;i++)
            mas[i]=this.mas[i];
        mas[this.size]=al;
        this.size++; this.mas=mas;
    }

    @Override
    public Massiv clone() {
        Massiv res = new Massiv(this);
        return res;
    }

    public boolean equals(Massiv obj) {
        if(this.size!=obj.getSize())
            return false;
        for(int i=0;i<this.size;i++)
            if(this.mas[i]!=obj.setEl(i))
                return false;
        return true;
    }

}

