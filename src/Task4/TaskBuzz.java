package Task4;

import java.util.Scanner;

public class TaskBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for ( int i=1;i<=25;i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) ;
            {
                System.out.println("Buzz");

            }
        }



