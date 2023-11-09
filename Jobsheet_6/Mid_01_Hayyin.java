import java.util.Scanner;

public class Mid_01_Hayyin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input vehicle type 
        System.out.print("enter the vehicle type (2-wheel or 4-wheel): ");
        String vehicleType01 = input.nextLine();

        // Input duration parking
        System.out.print("Enter the duration of parking hours: ");
        int duration01 = input.nextInt();

        // Input number plate
        input.nextLine(); // cleaning newline
        System.out.print("enter the number plate: ");
        String plateNumber01 = input.nextLine();

        // count tarif parkir
        double parkingFee01;
        if (vehicleType01.equalsIgnoreCase("2-wheel")) {
            parkingFee01 = 2000.0 * duration01;
        } else if (vehicleType01.equalsIgnoreCase("4-wheel")) {
            parkingFee01 = 5000.0 * duration01;
        } else {
            System.out.println("Not a Vehicle");
            return;
        }

        // Check if the license plate starts with "N" and has a starting number of 5
        if (plateNumber01.startsWith("N") && plateNumber01.charAt(1) == '5') {
            double discount01 = 0.005 * parkingFee01;
            parkingFee01 -= discount01;
        }

        // displays results
        System.out.println("Vehicle Type: " + vehicleType01);
        System.out.println("duration of parking hours: " + duration01 + " hour");
        System.out.println("Plate Number: " + plateNumber01);
        System.out.println("Parking Fee: Rp " + parkingFee01);

    }
}
