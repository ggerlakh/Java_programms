package ru.mirea.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
// Создаем класс BoundedWaitList согласно UML диаграмме
public class BoundedWaitList<E> extends WaitList <E> {
    protected ConcurrentLinkedQueue<E> content;
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
        content = new ConcurrentLinkedQueue<E>();
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() >= capacity) {
            System.out.println("Переполнение!");
        } else
            content.add(element);
    }

    @Override
    public E remove() {
        content.remove(content.element());
        return content.element();
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public String toString() {
        String str = "";
        for (E elem :
                content) {
            str += elem + ", ";
        }
        return str;
    }
}
