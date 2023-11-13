import java.util.Scanner;

public class ArrayAverageScore01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input01.nextInt();

        int[] score = new int[numberOfStudents];
        double totalPassed = 0;
        double totalFailed = 0;
        double averagePassed;
        double averageFailed;
        int passedCount = 0;
        int failedCount = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = input01.nextInt();

            if (score[i] > 70) {
                totalPassed += score[i];
                passedCount++;
            } else {
                totalFailed += score[i];
                failedCount++;
            }
        }

        // Menghitung rata-rata nilai siswa yang lulus
        if (passedCount > 0) {
            averagePassed = totalPassed / passedCount;
            System.out.println("The average score of students who passed is " + averagePassed);
        } else {
            System.out.println("No students passed.");
        }

        // Menghitung rata-rata nilai siswa yang tidak lulus
        if (failedCount > 0) {
            averageFailed = totalFailed / failedCount;
            System.out.println("The average score of students who failed is " + averageFailed);
        } else {
            System.out.println("No students failed.");
        }
    }
}
