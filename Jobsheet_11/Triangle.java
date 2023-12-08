import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int N = input01.nextInt();
        int i = 0;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*"));
                j++;
            }
            i++;
        }
    }
}