package com.sda.git;

import java.util.Arrays;

//////// Implementacja wlasnej arrylisty
public class CustomList <E>
{
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public CustomList()
    {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public void add(E e)
    {
        if (size == elements.length)
        {
            resize();
        }
        elements[size++] = e;
    }
    public void resize () {
        int newSize = elements.length * 2;

        Object tmp[] = new Object[newSize];
        for (int i=0; i<elements.length; i++)
        {
            tmp[i] = elements[i];
        }
        elements = tmp;


        ///////////////// 2 rozwiazanie
//        elements = Arrays.copyOf(elements, newSize);
    }


            public E get (int i)
            {
                if (i >= size || i<0 )
                {
                    throw new IndexOutOfBoundsException("nie ma takiego elementu");
                }
                return (E) elements[i];
            }

            public int size ()
            {
                return  size;
            }

            public void remove(int index)
            {
                //miejsce w tablicy, ktore usuwamy
                

            }
}
