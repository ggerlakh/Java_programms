package ru.mirea.pr5;

public class Input {
    public static String input(int n) {
        if(n == 1) {
            return 1 + "\n";
        }
        return input(n-1) + n + "\n";
    }
    public static void main(String[] args) {
        System.out.println(input(5));
    }
}
