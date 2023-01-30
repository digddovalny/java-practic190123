package sem_2;

public class Main2 {
    public static int temp = 1;

    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();
        StringBuilder new_line = new StringBuilder();
        line.append("qqqqqwwwweeeqqqwwweeewwwqqqqqqqqeeeeeeedeeeeet");
        System.out.println(line);

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i)!=line.charAt(i+1)){
                new_line.append(line.charAt(i));
                if (temp != 1){
                    new_line.append(temp);
                    temp = 0;
                }
            }
            temp++;
        }
        append_symbol(new_line, line, line.length() - 1);
        System.out.println(new_line);
    }

    static void append_symbol(StringBuilder new_line, StringBuilder line, int i) {

    }
}
