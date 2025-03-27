package task;

/**
 * Задача реализовать метод calculate, который на вход принимает строковое выражение
 * На выходе возвращает результат в виде числа
 * Ограничения по вычислениям те же + числа могут быть только от 0 до 10
 * числа могут быть написаны в строковом представлении
 * В случае правильной реализации метод main должен выполниться без ошибок
 **/
public class Main {
    public static void main(String[] args) {
        System.out.print("Выражение: 5-2" );
        if (calculate("5-2") != 3) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: 5+ 2");
        if (calculate("  5+ 2") != 7) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: 5 * 2 ");
        if (calculate("5 * 2 ") != 10) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: 5-2");
        if (calculate("5 /2") != 2) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: a + b");
        if (calculate("a + b") != -1) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: 1 + 3 +25");
        if (calculate("1 + 3 +25") != -1) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: 1-g");
        if (calculate("1-g") != -1) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: 5-6");
        if (calculate("5-6") != -1) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: пять + четыре");
        if (calculate("пять + четыре") != 9) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: восемь - один");
        if (calculate("восемь - один") != 7) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");

        System.out.print("Выражение: три - 2");
        if (calculate("восемь - один") != -1) System.out.println(" результат: Ошибка");
        else System.out.println("результат: Верно");
    }

    private static int calculate(String expression) {
//   Реализовывать здесь
        return 0;
    }
}

