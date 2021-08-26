package ru.mirea.pr8;

import java.util.Collection;
//Создаем интерфейс IWaitList согласно UML диаграмме
public interface IWaitList<E> {
    public void add(E element);
    public E remove();
    public boolean contains(E element);
    public boolean containsAll(Collection<E> c);
    public boolean isEmpty();
}
