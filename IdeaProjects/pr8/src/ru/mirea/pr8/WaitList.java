package ru.mirea.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
//Создаем абстрактный класс WaitList согласно UML диаграмме
public abstract class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    public WaitList() {
        content = new ConcurrentLinkedQueue<E>();
    }
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<E>();
        c = content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
