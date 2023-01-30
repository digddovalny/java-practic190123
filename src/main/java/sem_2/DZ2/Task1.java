package sem_2.DZ2;

import java.util.Scanner;

public class Task1 {

    //Напишите метод, который принимает на вход строку (String) и
    // определяет является ли строка палиндромом (возвращает boolean значение).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для проверки на палиндром: ");
        String word = scanner.next().toLowerCase();

        isPalindrom(word);
    }

    private static boolean isPalindrom(String word) {

        int forward = 0;
        int backward = word.length()-1;

        while (backward != forward) {
            char forwardSymbol  = word.charAt(forward++);
            char backwardSymbol  = word.charAt(backward--);
            if (forwardSymbol!=backwardSymbol){
                System.out.println("Введенное слово не является палиндромом");
                return false;
            }
        }
        System.out.println("Введенное слово является палиндромом");
        return true;
    }
}
