import java.util.Scanner;

public class ForMultiplesStudent01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;

        System.out.print("Input the multiple = ");
        multiple = input01.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
               
            }
        }

        double average = (double) sum / counter; // Hitung rata-rata

        System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d.\n", multiple, sum);
        System.out.printf("The average of all multiples of %d in the range 1 to 50 is %.2f.\n", multiple, average);
    }
}
