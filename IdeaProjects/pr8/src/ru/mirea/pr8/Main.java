package ru.mirea.pr8;
// Создаем еще один класс для проверки работы программы
public class Main {
    public static void main(String args[]) {
        BoundedWaitList<Integer> bw = new BoundedWaitList<>(4);
        System.out.println(bw.getCapacity());
        bw.add(177);
        bw.add(56);
        bw.add(77);
        System.out.println(bw.toString());
        UnfairWaitList<String> uw = new UnfairWaitList<>();
        uw.add("Hello");
        uw.add("One");
        uw.add("Three");
        uw.add("Two");
        System.out.println(uw.toString());
        uw.moveToBack("Three");
        uw.remove("Three");
        System.out.println(uw.toString());
        uw.remove("Hello");
        System.out.println(uw.toString());
    }
}
