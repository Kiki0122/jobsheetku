import java.util.Scanner;

public class DoWhileLeaveEntitlementStudent01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Number of Leave Entitlement = ");
        leaveEntitlement = input01.nextInt();

        do {
            System.out.print("Do you want to take leave (y/n) = ");
            confirmation = input01.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Leave number = ");
                numLeave = input01.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("The remaining leave entitlement = " + leaveEntitlement);
                } else {
                    System.out.println("The remaining leave entitlement is not sufficient!");
                    System.out.print("Do you still want to take leave (y/n)? ");
                    confirmation = input01.next();
                    if (confirmation.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
        } while (leaveEntitlement > 0);
    }
}
