package org.study.lesson.two.array;

public class Main {
    public static void main(String[] args) {
//        int[] indexes = new int[5];
//        System.out.println(indexes[0]);
//        System.out.println(indexes[1]);
//        System.out.println(indexes[2]);
//        System.out.println(indexes[3]);
//        System.out.println(indexes[4]);
//        System.out.println("перебираем в цикле");
//        for (int i = 0; i < indexes.length; i++) {
//            System.out.println(indexes[i]);
//        }

        // индексы   0  1  2  3  4
        // значения {1, 2, 3, 4, 5}
        int a = 3;
        // end::= 3[]
        int[] b = new int[1];
        b[0] = 5;
        System.out.println("До " + b);

        addOne(b);

        System.out.println("После " + b);
    }

    static void addOne(int[] b) {
        b[0] = b[0] + 1;
    }
}
