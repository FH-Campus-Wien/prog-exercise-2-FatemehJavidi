package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");

        String n1 = scanner.next();

        n1 = n1.replace(',', '.');
        double number = Double.parseDouble(n1);

        if (number <= 0) {
            System.out.println("No number entered.");
        } else {
            double max = number;
            int k = 2;
            while (number > 0) {
                System.out.print("Number " + k + ": ");
                n1 = scanner.next();
                n1 = n1.replace(',', '.');
                number = Double.parseDouble(n1);
                k++;
                if (number > max) {
                    max = number;
                }
            System.out.println("The largest number is " + String.format("%1.2f", max));
        }
    }



        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}