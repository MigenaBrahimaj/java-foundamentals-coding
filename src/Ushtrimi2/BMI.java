package Ushtrimi3

public class BMI {
    import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.print("Jep peshen ne kg: ");
        float peshaNeKg=scanner.nextFloat();
        System.out,print("Jep gjatesine ne cm :");
        int gjatesiaNeCm=scanner.nextInt();
        double gjatesiaNeMeter=(double) gjatesiaNeCm/100;
        double bmi=((double) peshaNeKg)/( gjatesiaNeMeter * gjatesiaNeMeter);
        System.out.println(BMI= " + bmi);
        if (bmi <18.5) {
            System.out.println("Nenpeshe");
        }
        else if ( BMI>= 18.5&& BMI <18.5){


            System.out.println("BMI Ideale");
            else {
                System.out.println("Mbipeshe");
            }
        }



