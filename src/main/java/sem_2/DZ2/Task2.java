package sem_2.DZ2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        text = writeText();
        writeInFile(text);
    }

    private static StringBuilder writeText() {

        int count = 100;
        String text = "TEST";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }

        return sb;

    }

    private static void writeInFile(StringBuilder text) {
        try (PrintWriter pw = new PrintWriter("D:\\DZ Java\\java-practic190123\\src\\main\\resources\\lib\\text1.txt")) {
            pw.println(text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


