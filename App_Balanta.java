/*
Name: Gabriela Balanta
Date:3-03-2026
Assignment: 1.5 Guided Practcie Operators and Data Types

Description: this app will declare variables of various type,
 compare then with comparison operators, retrieve numbers from the user via the console,
add retrieved numbers and print results.
*/
import java.util.Scanner;


public class App_Balanta {
    public static void main(String[] args) throws Exception {
        /* prints the header line */
        System.out.println("Gabriela Balanta -- Week 1 GP Operators & Data Types");
        System.out.println();


        /* Decalres 4 integer values  */
        int intVal1 = 0;
        int intVal2 = 5;
        int intVal3 = 5;


        /* Demonstrates comparison operators */

        if (intVal2 == intVal3) {   /* equality */
            System.out.printf("%d is equal to %d%n", intVal2, intVal3);
        }
        
        if (intVal1 != intVal3) {   /* inequalty */
            System.out.printf("%d is not equal to %d%n", intVal1, intVal3);
        }

        if (intVal1 < intVal3) {   /* Less Than */
            System.out.printf("%d is less than %d%n",intVal1, intVal3);
        }
        
        if (intVal2 > intVal1) {    /*Greater Than */
            System.out.printf("%d is greater than %d%n", intVal2, intVal1);
        }

        if (intVal2 <= intVal3) {   /*Less Than or Equal To */
            System.out.printf("%d is less than or equal to %d%n",intVal2, intVal3);
        }

        if (intVal2 >= intVal3) {   /*Greater Than or Equal To */
            System.out.printf("%d is greater than or equal to 5d%n", intVal2, intVal3);
        }

        

        /*  make a scanner to get user input */
        Scanner input = new Scanner(System.in);

        /*  get 2 integer values from user an add them togehter*/
        System.out.println();
        System.out.println("Enter an integer value: ");
        double fltVal1 = input.nextDouble();
        
        System.out.println("Enter a second floating point value: ");
        double fltVal2 = input.nextDouble();

        double total = fltVal1 + fltVal2;

        System.out.printf("The sum of %.3f and %.3f is %.3f.%n", fltVal1, fltVal2, total);

    }
}
