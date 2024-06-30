
package Ushtrimi3;
import java.util.Scanner;

public class Ushtimi3Class {
    public static void main(String[] args) {
        int a;
        int b
                int c;
        Scanner input= new Scanner(System.in);
        System.out.println("Insert value for a: ");
         a = scanner.nextInt();
        System.out.println("Insert value for b: ");
        b = scanner.nextInt();
        System.out.println("Insert value for c: ");
        c = scanner.nextInt();

        double delta=Math.pow(b,2)-4*a*c;

        if (delta<0) {
            System.out.println("Dallori negativ,Ekuacioni nuk ka zgjidhje");
        }else if ( delta==0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }else{
            double x1= (-b-Math.sqrt(delta))/(2*a);
            System.out.println("Ekuacioni ka nje rrenje : + ");
            System.out.println("x1 : + x1);
        }
    }


