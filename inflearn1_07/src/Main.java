import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = new StringBuilder(str).reverse().toString();

        System.out.println(str.equalsIgnoreCase(str2) ? "YES" : "NO");
    }
}
