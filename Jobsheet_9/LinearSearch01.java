import java.util.Scanner;

public class LinearSearch01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int numberOfElements = input01.nextInt();

        int[] arrayInt = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = input01.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        int key = input01.nextInt();

        int result = -1; 

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}
