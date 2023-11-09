import java.util.Scanner;

public class Selection2Exp2Student01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minta pengguna memasukkan tiga sudut segitiga
        System.out.print("Input angle first: ");
        double angle1 = scanner.nextDouble();
        System.out.print("Input angle second: ");
        double angle2 = scanner.nextDouble();
        System.out.print("Input angle third: ");
        double angle3 = scanner.nextDouble();

        // Periksa jenis segitiga
        double totalAngle = angle1+angle2+angle3;

        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right triangle");
            } else if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Equilateral triangle");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
        

       
    }
}

