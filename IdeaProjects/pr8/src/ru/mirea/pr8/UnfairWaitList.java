package ru.mirea.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
// Создаем класс UnfairWaitList согласно UMl lbfuhfvvt
public class UnfairWaitList<E> extends WaitList <E> {
    protected ConcurrentLinkedQueue<E> content;

    public UnfairWaitList() {
        content = new ConcurrentLinkedQueue<E>();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.offer(element);
    }

    @Override
    public void add(E element) {
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
