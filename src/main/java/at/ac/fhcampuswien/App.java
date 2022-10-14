package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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


    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number!");
        } else {
            int counter = 1;
            for (int x = 1; x <= number; x++) {
                for (int y = 1; y <= x; y++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        int zeile = 6;

        for (int a = 0; a < zeile; a++) {
            for (int b = 0; b < zeile -1 -a; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < a*2+1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int a = scanner.nextInt();
        System.out.print("c: ");
        char b = scanner.next().charAt(0);
        if (a % 2 == 0) {
            System.out.println("Invalid number!");
        } else {
            for (int x = 0; x < a / 2 + 1; x++) {
                for (int y = 1; y < (a / 2 + 1) - x; y++) {
                    System.out.print(" ");
                }
                char zeichen = (char) (b - x);
                for (int j = 0; j <= 2 * x; j++) {
                    System.out.print(zeichen);
                    if (j >= x) {
                        zeichen--;
                    } else {
                        zeichen++;
                    }
                }
                System.out.println();
            }
            for (int y = 0; y < a / 2; y++) {
                for (int x = 0; x <= y; x++) {
                    System.out.print(" ");
                }
                char zeichen = (char) (b - a / 2 + y);
                for (int x = y + 1; x < a - (y + 1); x++) {
                    if (x < a / 2 + 1) {
                        zeichen++;
                    } else {
                        zeichen--;
                    }
                    System.out.print(zeichen);
                }
                System.out.println();
            }
        }
    }


    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int anzahl = 0;
        float anzahl2 = 0f;
        int anzahl3 = 0;
        while (true) {
            System.out.print("Mark " + (anzahl + 1) + ": ");
            int mark = scanner.nextInt();
            if (mark > 5 || mark < 0) {
                System.out.println("Invalid mark!");
            } else if (mark == 0) {
                break;
            } else {
                anzahl2 = anzahl2 + mark;
                anzahl++;
                if (mark == 5) {
                    anzahl3 = anzahl3 + 1;
                }
            }
        }
        float average = 0;
        if (anzahl > 0) {
            average = anzahl2 / anzahl;
        }
        System.out.printf("Average: %.2f", average);
        System.out.println();
        System.out.println("Negative marks: " + anzahl3);
    }

    //todo Task 6

    /* Task 6 taken from the Internet / https://javahungry.blogspot.com/2019/05/happy-number-program-in-java-with-example.html / last visit:
    10.10.2022 */
    public void happyNumbers(){
        System.out.print("n: ");
        // Input the number
        int inputNumber = new Scanner(System.in).nextInt();
        Boolean result = isHappyNumber(inputNumber);
        if (result == true)
            System.out.println("Happy number!");
        else
            System.out.println("Sad number!");
    }

        public static boolean isHappyNumber(int number) {
            Set<Integer> seenNumbers = new HashSet<Integer>();
            while(seenNumbers.add(number)){
                int digitsSum = 0;
                while(number > 0) {
                    digitsSum += Math.pow(number % 10 , 2);
                    number /= 10;
                }
                number = digitsSum;
                if(number == 1)
                    return true;
            }
            return false;
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