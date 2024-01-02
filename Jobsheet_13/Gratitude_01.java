import java.util.Scanner;
public class Gratitude_01 {
    public static String getGreetingRecipient(){
        Scanner input01 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recepientName = input01.nextLine();
        input01.close();
        return recepientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" May the force be with you!");
    }
}
