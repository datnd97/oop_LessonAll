package com.codegym.ArrayListMethod;
import java.lang.reflect.Array;
import java.util.Arrays;

class MyArrayList{

    private Object[] arrayObjs;
    private int idx;


    // Constructors
    public MyArrayList()
    {
        this(10);
    }

    public MyArrayList(int initialcapacity)
    {
        arrayObjs = new Object[initialcapacity];
    }

    /**
     *
     * @return size of the List
     */
    public int size()
    {
        return idx;
    }

    /**
     *
     * @param obj
     * @return status of the operation
     */
    public boolean add(Object obj)
    {
        return add(idx, obj);
    }

    /**
     *
     * @param index of the new object
     * @param obj to be added to the List
     * @return status of the operation
     */
    public boolean add(int index, Object obj)
    {
        // check for the index out of bounds condition
        if(index < 0 || index > idx)
        {
            throw new ArrayIndexOutOfBoundsException();
        }

        // increase the size of the list if idx reaches the maximum limit
        if(idx > arrayObjs.length - 1)
        {
            increaseSize();
        }

        if(index < idx)
        {
            // Prior to inserting the new element, move all the elements to next positions
            for(int temp = idx+1; temp > index; temp--)
            {
                arrayObjs[temp] = arrayObjs[temp-1];
            }

            // insert the element
            arrayObjs[index] = obj;

            // as the new element is added, increment the idx value.
            idx++;
        }
        else
        {
            // insert the element at the idx position
            arrayObjs[idx++] = obj;
        }

        return true;
    }

    /**
     *
     * @param obj
     * @return status of the operation
     */
    public boolean remove(Object obj)
    {
        // Find the index of the obj in the array and call remove(index) method
        for(int i = 0; i < idx; i++)
        {
            if(arrayObjs[i].equals(obj))
            {
                return remove(i);
            }
        }

        return true;
    }


    /**
     *
     * @param index
     * @return status of the operation
     */
    public boolean remove(int index)
    {
        if(index < 0 || index > idx)
        {
            throw new ArrayIndexOutOfBoundsException();
        }

        for(int i = index; i < idx - 1; i++)
        {
            arrayObjs[i] = arrayObjs[i+1];
        }

        // as the new element is deleted, decrement the idx value.
        arrayObjs[idx-1] = null;
        idx--;

        return true;
    }

    private void increaseSize()
    {
        int newcapacity = (arrayObjs.length * 3/2) + 1;

        arrayObjs = Arrays.copyOf(arrayObjs, newcapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < idx; i++)
        {
            sb.append(arrayObjs[i].toString() + ",");
        }

        return "[" + sb.toString().substring(0, sb.length() - 1) + "]";
    }
}


