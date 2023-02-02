import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so 1: ");
        int l = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao so 2: ");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println(count(l,r));
    }

    public static int count(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            String j = String.valueOf(i);
            if (j.charAt(0) == j.charAt(j.length() - 1)) {
                count++;
            }
        }
        return count;
    }
}


