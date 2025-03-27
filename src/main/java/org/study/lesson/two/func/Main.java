package org.study.lesson.two.func;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int f) {
        if (f != 1) {
            return f * factorial(f - 1);
        }
        return f;
    }

}
