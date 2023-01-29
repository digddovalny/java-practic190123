package lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ex1();
//        ex2();
        ex3();
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

    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.print("Привет," + name + "!");
    }

    private static void ex2() {
        int[] binaryArray = new int[1000];
        int count = 0;
        int maxLength = 0;
        Random random = new Random();

        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(2);
        }
//        System.out.println(Arrays.toString(binaryArray));
        for (int num : binaryArray) {
            if (num == 1)
            {
                count++;
            }
            else
            {
//                if (count > maxLength)
//                {
//                    maxLength = count;
//                    count = 0;
//                }
                maxLength = Math.max(count, maxLength);
                count = 0;
            }
        }

        System.out.println("max length: "+Math.max(count, maxLength));
            
        }
    }
