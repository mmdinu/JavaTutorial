package HomeWork;

import java.util.Scanner;

// How do we get an average of numbers, numbers that we type from the keyboard!

// Define the class
public class Home_Work {
    double firstNum;
    double secondNum;
    double thirdNum;

// Define first variable
    public void getNumbers(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        firstNum = keyboard.nextDouble();
        System.out.println("Enter your second number: ");
        secondNum = keyboard.nextDouble();
        System.out.println("Enter your third number: ");
        thirdNum = keyboard.nextDouble();
    }
//  Variable double for average
    public double getAverage(){
        return (firstNum + secondNum + thirdNum) / 3.0;

    }
// Printing the results
    public static void main(String[] args) {
        Home_Work ab = new Home_Work ();
        ab.getNumbers();
        System.out.println("The average is: " + ab.getAverage());
    }
}