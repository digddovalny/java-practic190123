package lesson1.DZ1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        ex1();
        //Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год ---> ");
        int year = scanner.nextInt();
        ex2(year);
        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
//        ex3();
    }

    private static void ex1() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int ArraySize = scanner.nextInt();
        int[] Array = new int[ArraySize];
        int max = 0;
        int min = 0;
        Random random = new Random();

        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(101);
        }
        System.out.println("Сгенерированный массив: "+(Arrays.toString(Array)));

        Arrays.sort(Array);
        min = Array[0];
        max = Array[Array.length-1];

        System.out.println("Минимальный элемент массива равен: "+min+" максимальный элемент массива равен: "+max);
    }
    public static void ex2(int year)
    {
        boolean IsLeapYear = false;

        if (year % 4 == 0) {
            IsLeapYear = true;

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    IsLeapYear = true;
                else
                    IsLeapYear = false;
            }
        }

        else

            IsLeapYear = false;
        if (!IsLeapYear)
            System.out.println(year + " год не является високосным");
        else
            System.out.println(year + " : год является високосным");
    }

    private static void ex3() {

        int[] array = new int[10];
        Random random = new Random();
        int left = 0;
        int right = array.length-1;
        int val = 3;
        int data = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,5);
        }
        System.out.println(Arrays.toString(array));


        while (left<=right){
            if (array[left] == val & array[right] != val){
                data = array[left];
                array[left] = array[right];
                array[right] = data;
                left++;
                right--;
            }
            if (array[left] != val){
                left++;
            }
            if (array[right] == val) {
                right--;
            }
        }
        System.out.println("Отсортирванный массив: "+(Arrays.toString(array)));

    }
}
