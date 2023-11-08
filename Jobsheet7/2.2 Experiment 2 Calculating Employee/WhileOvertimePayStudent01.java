import java.util.Scanner;

public class WhileOvertimePayStudent01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int numEmployee, overtimeHours, overtimePay = 0;
        double totalOvertimePay = 0; // Inisialisasi totalOvertimePay
        String position;

        System.out.print("Employee number = ");
        numEmployee = input01.nextInt();

        int i = 0;

        while (i < numEmployee) {
            System.out.print("Position of employee " + (i + 1) + " (director, manager, staff, programmer) = ");
            position = input01.next();
            
            if (position.equalsIgnoreCase("director")) {
                System.out.print("Employee " + (i + 1) + " overtime hours = ");
                overtimeHours = input01.nextInt();
                overtimePay = overtimeHours * 120000;
            } else if (position.equalsIgnoreCase("manager")) {
                System.out.print("Employee " + (i + 1) + " overtime hours = ");
                overtimeHours = input01.nextInt();
                overtimePay = overtimeHours * 100000;
            } else if (position.equalsIgnoreCase("staff")) {
                System.out.print("Employee " + (i + 1) + " overtime hours = ");
                overtimeHours = input01.nextInt();
                overtimePay = overtimeHours * 75000;
            } else if (position.equalsIgnoreCase("programmer")) {
                System.out.print("Employee " + (i + 1) + " overtime hours = ");
                overtimeHours = input01.nextInt();
                overtimePay = overtimeHours * 85000;
            } else {
                System.out.println("Invalid position!");
                continue;
            }

            totalOvertimePay += overtimePay;
            i++;
        }

        // Setelah keluar dari perulangan, tampilkan totalOvertimePay
        System.out.println("Total of Overtime Pay = " + totalOvertimePay);
    }
}
