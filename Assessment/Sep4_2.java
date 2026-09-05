import java.util.Scanner;

public class Sep4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();
        String result = "";

        for (int i = 0; i < txt.length(); i++) {
            result = result + txt.charAt(i);

            if (i < txt.length() - 1 &&
                txt.charAt(i) == txt.charAt(i + 1)) {
                result = result + "*";
            }
        }

        System.out.println(result);
    }
}