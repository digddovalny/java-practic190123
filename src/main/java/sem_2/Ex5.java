package sem_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        ex5("D:\\DZ Java\\java-practic190123");
    }

    private static void ex5(String path) {
        StringBuilder sb = new StringBuilder();
        for (String fileName : convertPathToNamesArr(path)) {
            sb.append(fileName).append(System.lineSeparator());
        }

        try(PrintWriter pw = new PrintWriter("D:\\DZ Java\\java-practic190123\\src\\main\\resources\\lib\\l2ex5.txt")) {
            pw.println(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static String[] convertPathToNamesArr(String path) {
        File dir = new File(path);
        return dir.list();
    }
}
