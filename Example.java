import java.util.Scanner;


public class Example {

    public static void main(String[] args){

        // need one scanner object to make Java interactive 
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Write a Message");

        //String message = scanner.nextLine();

        //System.out.println(message);

        //String start = "My name is ";
        //String end = ", James Bond";

        //System.out.println(start + "Bond" + end);



        //String message2 = scanner.nextLine();
        //System.out.println("You wrote: " + message2);
        //System.out.println(message2);
        //System.out.println(message2);

        //Integer.valueof() takes the string and converts it into and integer (Wrapper object for int)
        //int num = Integer.valueOf(scanner.nextLine());
        //System.out.println(Math.sqrt(num));

        // write a program that take two #s from user and sums their square root

        /*
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        double sqrt1 = Math.sqrt(first);
        double sqrt2 = Math.sqrt(second);
        System.out.println(sqrt1 + sqrt2);
        */

        //Write a program that reads an integer from the user. 
        //If the number is less than 0, the program prints the given integer multiplied by -1. 
        //In all other cases, the program prints the number itself. 

        /*
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num < 0){
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }
        /*

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num1 > num2){

            System.out.printf("%d is greater than the %d", num1, num2);
        } if (num1< num2){
            System.out.printf("%d is greater than the %d", num2, num1);
        } else{
            System.out.printf("%d is equal to %d", num1, num2);
        }*/
        printChristmasTree(10);

    }

    // Advanced astrology (3 parts)
    public static void printSpaces(int number){

        int i = 0;

        while (i < number){
            System.out.print(" ");
            i++;

        }

    }

    public static void printStars(int number){
        // i - controls how many stars get printed on that specific line
        // i resets to 0 everytime the method is called 
        int i = 0;

        while (i < number){
            System.out.print("*");
            i++;

        }
        System.out.println(); //move to next line

        

    }

    public static void printChristmasTree(int size){
        // row - controls which line you are on
        int row = 1;
        while (row <= size){
            printSpaces(size - row);
            printStars((2*row)-1);
            row++;
        }
    }

}