/*
Name: Gabriela Balanta
Date:3-03-2026

Assignment:1-4 Display Text Week 1

Description: will use printf to print out a line of text
*/

public class App {
    public static void main(String[] args) throws Exception {
        /*prints out a line of text to console */
        System.out.println("Hello, Gabriela Balanta! Welcome to Java Programing!");

        /*Prints a blank line */
        System.out.println();

        /*prints out a formated line of text using printf 
            %s    prints a string value
            %n    prints a newline character at the position
            %d    prints a decimal (integer) value
            %.2f  prints a number with 2 decimal places
            order of elements in format definition matchs the order of the parameters in printf function call.
            Format of call: printf("format string", param1, param2) 
        
        */
        System.out.printf("%s%n%s%n%s%d%n%s%.2f%n%s%.2f",
        "A string followed by a new line.",
                 "A string following the newline.",
                 "Decimal (integer) value: ", 4,
                 "Floating point number to 2 decimals: ", 3.1415,
                 "Floating point number to 2 decimals (rounded): ",1.199);      
    }
}
