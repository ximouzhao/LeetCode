package programbase.seg6.q45;

import java.util.EmptyStackException;

public class Stack implements Cloneable
{
    public static void main(String[] args) {
        Stack stack=new Stack(1);
        stack.push(111);
        stack.push(111);
        stack.push(111);
        stack.push(111);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.notify();
    }
    private Object[] elements;
    private int size = 0;
    public Stack(int initialCapacity) 
    {
        this.elements = new Object[initialCapacity];
    }

    public void push(Object e) 
    {
        ensureCapacity();
        elements[size++] = e;
    }
    
    public Object pop() 
    {
        if (size == 0)
        {
            throw new EmptyStackException();
        }
        return elements[--size];
    }
    
    private void ensureCapacity() 
    {
        if (elements.length == size) 
        {
            Object[] oldElements = elements;
            elements = new Object[2 * elements.length + 1];
            System.arraycopy(oldElements, 0, elements, 0, size);
        }
}
}
