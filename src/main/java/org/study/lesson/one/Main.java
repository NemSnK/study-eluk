package org.study.lesson.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Пожалуйста, представьтесь: ");
        String username = scan.nextLine();
        System.out.println("Здравствуйте, " + username);

        System.out.println("Выберите операцию: +, -, *, /");
        String operation = scan.nextLine();

        {
            if (operation.equals("+")) {
                System.out.println("Введите первое слагаемое");
            }
            String slagaemoe1 = scan.nextLine();
            System.out.println("Введите второе слагаемое");
            String slagaemoe2 = scan.nextLine();
            Integer sum = Integer.parseInt(slagaemoe1) + Integer.parseInt(slagaemoe2);
            System.out.println(sum);
        }

        {
            if (operation.equals("-")) {
                System.out.println("Введите уменьшаемое");
            }
            String num1 = scan.nextLine();
            System.out.println("Введите вычитаемое");
            String num2 = scan.nextLine();
            Integer minus = Integer.parseInt(num1) - Integer.parseInt(num2);
            System.out.println(minus);
        }
        {
            if (operation.equals("*")) {
                System.out.println("Введите первый множитель");
            }
            String num1 = scan.nextLine();
            System.out.println("Введите второй множитель");
            String num2 = scan.nextLine();
            Integer multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
            System.out.println(multiplication);
        }
        {
            if (operation.equals("/")) {
                System.out.println("Введите делимое");
            }
            String num1 = scan.nextLine();
            System.out.println("Введите делитель");
            String num2 = scan.nextLine();
            if (num2 == 0) {
                System.out.println("Error");
            }
        }else{
            int division = Integer.parseInt(num1) / Integer.parseInt(num2);
            System.out.println(division);
        }
    }
}