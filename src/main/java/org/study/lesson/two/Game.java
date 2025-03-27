package org.study.lesson.two;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        int count = 9;

        String[][] gameMap = new String[3][3];
        init(gameMap);

        do {
//          Ход игрока
            System.out.println("введите координату x: ");
            x = scanner.nextInt();

            System.out.println("введите координату Y: ");
            y = scanner.nextInt();

            gameMap[x][y] = "X";

            count--;
//            Проверяем оставшееся количество ходов.
            if (count == 0) {
                System.out.println("Игра окончена");
                return;
            }
            drawMap(gameMap);
//            Ход компьютера
            computerStep(gameMap);
            count--;
            drawMap(gameMap);
        } while (count != 0);

        System.out.println("Игра окончена");
    }

    static void init(String[][] gameMap) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                gameMap[i][j] = "*";
                if (j != 2) {
                    System.out.print(gameMap[i][j] + " |");
                } else {
                    System.out.println(gameMap[i][j] + "\n");
                }
            }
        }
    }

    static void drawMap(String[][] gameMap) {
        System.out.println("-----------------------------------------");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j != 2) {
                    System.out.print(gameMap[i][j] + " |");
                } else {
                    System.out.println(gameMap[i][j] + "\n");
                }
            }
        }
        System.out.println("-----------------------------------------");
    }

    static void computerStep(String[][] gameMap) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(0, 3);
            y = random.nextInt(0, 3);

        } while (!gameMap[x][y].equals("*"));

        gameMap[x][y] = "0";
    }

    static int countFreeCells(String[][] gameMap) {
        int resualt = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (gameMap[i][j].equals("*")) resualt++;
            }
        }
        return resualt;
    }
}
