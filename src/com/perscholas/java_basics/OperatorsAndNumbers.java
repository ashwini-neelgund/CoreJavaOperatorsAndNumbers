package com.perscholas.java_basics;

import java.util.Scanner;

public class OperatorsAndNumbers {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int operation;
        do {
            System.out.println("\n---------------------------------------------");
            System.out.println("1. Left shift Operation");
            System.out.println("2. Right shift operation");
            System.out.println("3. Bitwise operations");
            System.out.println("4. Postfix increment operation");
            System.out.println("5. Different ways of incrementing variable");
            System.out.println("6. Prefix and Postfix operations");
            System.out.println("7. Exit");
            System.out.println("Please select one of the operation to perform : ");
            operation = input.nextInt();
            switch (operation) {
                case 1:
                    leftShiftOperation();
                    break;
                case 2:
                    rightShiftOperation();
                    break;
                case 3:
                    bitwiseOperations();
                    break;
                case 4:
                    postfixOperation();
                    break;
                case 5:
                    variableIncrementing();
                    break;
                case 6:
                    prefixPostfixOperations();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("ERROR : Please select valid operation");
            }
        } while (operation != 7);
    }

    /*
    Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
    Create another variable sum and assign the value of ++x added to y and print the result.
    Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++)
    and re-run the program. Notice what the value of sum is.
    The first configuration incremented x and then calculated the sum while the second configuration
    calculated the sum and then incremented x.
     */
    private static void prefixPostfixOperations() {

        int x = 5, y = 8, sum;
        sum = ++x + y;
        System.out.println("Prefix operation : ++" + x + " + " + y + " = " + sum);
        x = 5;
        sum = x++ + y;
        System.out.println("Postfix operation : " + x + "++ + " + y + " = " + sum);
    }

    /*
    Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
    Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.
     */
    private static void variableIncrementing() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter a number : ");
        int x = input.nextInt();
        System.out.println("3 ways of incrementing numbers : ");
        ++x;
        System.out.println("Prefix operator : ++x = " + x);
        x++;
        System.out.println("Postfix operator : x++ = " + x);
        x += x;
        System.out.println("Assignment operator : x += " + x);

    }

    /*
    Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator
    to increase the value. Print the value before and after the increment operator.
     */
    private static void postfixOperation() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter a number : ");
        int x = input.nextInt();
        System.out.println("Before postfix operation : " + x);
        x++;
        System.out.println("After postfix operation : " + x);
    }

    /*
    Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y.
    Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
    Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
    Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y.
    As before, write a comment that indicates what you predict the values to be before printing them out.
     */
    private static void bitwiseOperations() {

        int x = 7, y = 17, z;

        //Bitwise & operation
        // x & y : (binary)1, (decimal)1
        z = x & y;
        System.out.println("Value after bitwise & operation on x and y : ");
        System.out.println("Decimal value : " + z);
        System.out.println("Binary value : " + Integer.toBinaryString(z));

        //Bitwise | operation
        // x | y : 10111(binary), 23(decimal)
        z = x | y;
        System.out.println("Value after bitwise | operation on x and y : ");
        System.out.println("Decimal value : " + z);
        System.out.println("Binary value : " + Integer.toBinaryString(z));
    }

    /*
    Write a program that declares a variable x and assigns 150 to it and prints out the binary string
    version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x.
    Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value
    of x and the binary string.
    Do the preceding exercise with the following values:225,1555,32456
     */
    private static void rightShiftOperation() {

        int var[] = new int[]{150, 225, 1555, 32456};
        for (int x : var) {
            System.out.println("\nBinary Version of " + x + " : " + Integer.toBinaryString(x));
            x = x >> 2;
            System.out.println("Number after right shift by 2 ");
            System.out.println("Decimal Form : " + x);
            System.out.println("Binary Form : " + Integer.toBinaryString(x));
        }
    }

    /*
     Write a program that declares an integer a variable x and assigns the value 2 to it and prints out the binary
     string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by
     1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value
     and binary string. Now, print out x in decimal form and in binary notation.
     Do the preceding exercise with the following values:9,17,88
     */
    private static void leftShiftOperation() {

        int var[] = new int[]{2, 9, 17, 88};
        for (int x : var) {
            System.out.println("\nBinary Version of " + x + " : " + Integer.toBinaryString(x));
            x = x << 1;
            System.out.println("Number after left shift by 1 ");
            System.out.println("Decimal Form : " + x);
            System.out.println("Binary Form : " + Integer.toBinaryString(x));
        }
    }
}
