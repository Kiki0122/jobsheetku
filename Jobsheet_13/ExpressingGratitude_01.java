import java.util.Scanner;

public class ExpressingGratitude_01 {
    public static String getGreetingRecipient() {
        Scanner input01 = new Scanner(System.in);
        System.out.print("Input the name of people you want greet: ");
        String recipientName = input01.nextLine();
        input01.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world. \n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything");
    }

    public static void sayAdditionalGreetings(String additionalMessage) {
        System.out.println("Additional Greetings: " + additionalMessage);
    }

    public static void main(String[] args) {
        sayThankyou();

        // Contoh pemanggilan sayAdditionalGreetings()
        sayAdditionalGreetings("Wishing you a great day!");
    }
}
