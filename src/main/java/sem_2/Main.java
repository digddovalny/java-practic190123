package sem_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
    }
    private static void ex1() {
        Scanner lineScanner = new Scanner(System.in);

        int n = -1;
        do {
            System.out.print("Введите натуральное число: ");
            try {
                n = lineScanner.nextInt();
            } catch (Exception e) {
                System.out.print("Ошибка! ");
                e.printStackTrace();
            }
        } while (n <= 0);

        System.out.print("Введите первый символ: ");
        String c1String = "";
        try {
            c1String = lineScanner.next();
        } catch (Exception e) {
            System.out.print("Ошибка! ");
        }

        System.out.print("Введите второй символ: ");
        String c2String = "";
        try {
            c2String = lineScanner.next();
        } catch (Exception e) {
            System.out.print("Ошибка! ");
        }
        lineScanner.close();


        char c1 = c1String.charAt(0);
        char c2 = c2String.charAt(0);

        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        System.out.println(sb);
    }
}
