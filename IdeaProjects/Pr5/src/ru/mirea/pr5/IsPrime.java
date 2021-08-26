package ru.mirea.pr5;

public class IsPrime {
    public static int checkPrime(int n, int j) {
        if ((((n) % j) != 0) | (n == 2)) {
            return 1;
        }
        if (n % j == 0) {
            return 0;
        }
        return checkPrime(n, j+1);

    }
    public static void main(String[] args) {
        int n = 4;
        int j = 2;
        if (checkPrime(n,j) == 1) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
