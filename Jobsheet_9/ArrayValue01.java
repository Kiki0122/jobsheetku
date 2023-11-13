import java.util.Scanner;

public class ArrayValue01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int[] finalScore = new int[10];

        // Input nilai untuk setiap siswa
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = input01.nextInt();
        }

        // Tampilkan semua siswa dan tandai siswa yang lulus atau tidak lulus
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Student " + i + " - Final Score: " + finalScore[i] + " - ");
            
            if (finalScore[i] > 70) {
                System.out.println("Passed!");
            } else {
                System.out.println("Failed!");
            }
        }
    }
}
