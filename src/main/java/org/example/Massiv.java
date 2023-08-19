package org.example;


import java.util.stream.Stream;

interface InfMassiv
{
    public Object setEl(int index);
    public void getEl(int index,Object el);
    public int getSize();
    public String toString();
    public void RestartParam();
    public boolean equals(Massiv obj);
}


public class Massiv implements InfMassiv {

    private  Object mas[];
    private int size = 10;

    public Massiv() {
        mas = new Object[size];
    }

    public Massiv(int size) {
        this.size = size;
        mas = new Object[size];
    }
    public Massiv(Massiv masObj)
    {
        this.size = masObj.getSize();
        this.mas = new Object[this.size];
        for(int i=0;i<masObj.getSize();i++) this.getEl(i,masObj.setEl(i));
    }
    @Override
    public Object setEl(int index) {
        return this.mas[index];
    }

    @Override
    public void getEl(int index,Object el) {
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
    public void RestartParam() {
        for (int i = 0; i < size; i++)
            mas[i] = (int) (Math.random() * 100 + 1);
    }

    @Override
    public Massiv clone() {
        Massiv res = new Massiv(this);
        return res;
    }

    @Override
    public boolean equals(Massiv obj) {
        if(this.size!=obj.getSize()) return false;
        for(int i=0;i<this.size;i++)if(this.mas[i]!=obj.setEl(i)) return false;
        return true;
    }


}
