import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap n:");
        int n= scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j==1){
                    System.out.print("*");
                }else if(i==j){
                    System.out.print("*");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for (int i = 1; i <=n-1 ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                if (j==1){
                    System.out.print("*");
                }else if(j==n-i){
                    System.out.print("*");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}