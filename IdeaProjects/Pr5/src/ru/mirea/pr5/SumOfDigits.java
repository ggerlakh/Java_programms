package ru.mirea.pr5;

public class SumOfDigits {

    public static int recSum(int n) {

        if (n/10 == 0) {
            return n%10;
        }
        return n%10 + recSum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(recSum(156));
    }
}
