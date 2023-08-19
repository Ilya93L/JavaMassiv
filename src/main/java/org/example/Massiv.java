package org.example;


import java.util.stream.Stream;

interface InfMassiv
{
    public String toString();
    public void RestartParam();
    public Object clone();
    public boolean equals(Object obj);
}


public class Massiv<T> implements InfMassiv {

    Object mas[];
    int size=10;
    public Massiv()
    {
        mas =  new Object[size];
    }
    public Massiv(int size)
    {
        this.size = size;
        mas = new Object[size];
    }

    @Override
    public String toString()
    {
        StringBuffer res = new StringBuffer();
        for(Object a:mas) res.append(" "+a);
        return res.toString();
    }
    @Override
    public void RestartParam() {
     for(int i=0;i<size;i++)
         mas[i]=(int)(Math.random()*100+1);
    }

    @Override
    public Object clone() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }


}
