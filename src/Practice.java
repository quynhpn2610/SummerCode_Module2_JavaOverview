import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Check prime
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        isPrime(number);

        // Insert a new value to an array
        System.out.println("Enter a number to insert: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the index: ");
        int index = Integer.parseInt(sc.nextLine());
        int[] newArray = insertIntoArray(x, index);
        System.out.println(Arrays.toString(newArray));
    }
    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number == 2) {
            System.out.println(number + " is a prime.");
            return true;
        }
        else if (number < 2) {
            System.out.println(number + " is not a prime.");
            return false;
        }
        else { //number > 2
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime.");
                    return false;
                }
            }
            return true;
        }
    }

    // Insert a new value to an array
    public static int[] insertIntoArray(int x, int index){
        int[] myArray = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        // {10, 4, 32, 6, 7, 8, 0, 0, 0, 0}
        if (index <= 0 && index >= myArray.length-1){
            System.out.println("Cannot insert number");
        }
        else{
            for (int i = myArray.length-1; i > index; i--) {
                myArray[i] = myArray[i-1];
            }
            myArray[index] = x;
        }
        return myArray;
    }

    public static void sayHello () {
        System.out.println("Hello World");
    }

}

