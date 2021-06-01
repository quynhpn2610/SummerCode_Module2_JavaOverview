import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    private static int[] myArray = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        // Check prime
//        System.out.println("Enter a number: ");
//        int number = Integer.parseInt(sc.nextLine());
//        isPrime(number);
//
//        // Print prime < 100
//        printPrime();
//        // Print first n prime
//        System.out.println("Enter the number of prime numbers you want to print: ");
//        int numb = Integer.parseInt(sc.nextLine());
//        int[] results = printPrime2(numb);
//        System.out.println(Arrays.toString(results));


//        // Insert a new value to an array
//        System.out.println("Enter a number to insert: ");
//        int x = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter the index: ");
//        int index = Integer.parseInt(sc.nextLine());
//        int[] newArray = insertIntoArray(x, index);
//        System.out.println(Arrays.toString(newArray));

//        // Remove from Array
//        System.out.println("Enter a number to delete: ");
//        int x = Integer.parseInt(sc.nextLine());
//        removeFromArray(x, myArray);
//        System.out.println(Arrays.toString(myArray));

//        // Matrix Generation
//        int[][] myMatrix = matrixFill();
//        // Calculate diagonal elements
//        // int result1 = matrixCalc(myMatrix);
//        // Calculate sum of column elements
//        System.out.println("Enter the column index: ");
//        int colIndex = Integer.parseInt(sc.nextLine());
//        int result2 = matrixCol(myMatrix, colIndex);
//        System.out.println("Result: " + result2);

//        // String element count
//        System.out.println("Enter a string: ");
//        String myString = sc.nextLine().toLowerCase();
//        System.out.println("Enter a character: ");
//        char myChar = sc.nextLine().charAt(0);
//        int count = elementCount(myString, myChar);
//        System.out.println("Count: " + count);

        // Reverse the array
        int[] anArray = createArray();
        System.out.println(Arrays.toString(anArray));
        int[] newArray = arrayReverse(anArray);
        System.out.println(Arrays.toString(newArray));
    }


    //Check if a number is prime
    public static boolean isPrime(int number) {
        if (number == 2) {
            System.out.println(number + " is a prime.");
            return true;
        } else if (number < 2) {
            System.out.println(number + " is not a prime.");
            return false;
        } else { //number > 2
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime.");
                    return false;
                }
            }
            return true;
        }
    }

    // Print all prime numbers < 100
    public static boolean checkPrime(int x) {
        if (x != 2) {
            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printPrime() {
        for (int i = 2; i < 101; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Print the first n prime numbers
    public static int[] printPrime2(int numb) {
        int count = 0;
        int[] results = new int[numb];
        int i = 0;
        int N = 2;
        while (count < numb) {
            if (checkPrime(N)) {
                count++;
                results[i++] = N;
            }
            N++;
        }
        return results;

    }


    // Insert a new value to an array
    public static int[] insertIntoArray(int x, int index) {
        // int[] myArray = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        // {10, 4, 32, 6, 7, 8, 0, 0, 0, 0}
        if (index <= 0 && index >= myArray.length - 1) {
            System.out.println("Cannot insert number");
        } else {
            for (int i = myArray.length - 1; i > index; i--) {
                myArray[i] = myArray[i - 1];
            }
            myArray[index] = x;
        }
        return myArray;
    }

    // Remove from array
    public static void removeFromArray(int x, int[] someArray) {
        int index_del = 0;
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] == x) {
                index_del = i;
                for (int j = index_del; j < someArray.length - 1; j++) {
                    someArray[j] = someArray[j + 1];
                }
            }
        }
    }

    // 2D array
    // Get user to input a 2D array
    public static int[][] matrixFill() {
        Scanner newSc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(newSc.nextLine());
        System.out.println("Enter the number of columns: ");
        int col = Integer.parseInt(newSc.nextLine());
        int[][] aMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter a matrix elements: ");
                aMatrix[i][j] = Integer.parseInt(newSc.nextLine());
            }
        }
        return aMatrix;
    }

    // Calculate the diagonal elements
    public static int matrixCalc(int[][] someMatrix) {
        int sum = 0;
        for (int i = 0; i < someMatrix.length; i++) {
            sum += someMatrix[i][i];
        }
        return sum;
    }

    // Calculate the element of a matrix column
    public static int matrixCol(int[][] anotherMatrix, int colIndex){
        int colSum = 0;
        for (int i = 0; i < anotherMatrix.length; i++) {
            colSum += anotherMatrix[i][colIndex-1];
        }
        return colSum;
    }

    // Count string element occurrence
    public static int elementCount(String myStr, char myChar){
        int numb = 0;
        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) == myChar){
                numb ++;
            }
        }
        return numb;
    }

    // Create an array using user input
    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the size of your array: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20){
                System.out.println("Size cannot exceed 20. Please enter again.");
            }
        } while (size > 20);

        int[] array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.println("Enter array element " + (i+1) + ": ");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        return array;
    }

    // Reverse an array
    public static int[] arrayReverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

}








