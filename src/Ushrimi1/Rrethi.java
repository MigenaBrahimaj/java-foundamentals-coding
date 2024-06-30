package Ushrimi;

import java.util.Scanner;

public class Rrethi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("jep diametrin");
        float diametri=scanner.nextFloat();
        float rrezja =diametri/2;
        float perimetri1=(float) (2*Math.PI*rrezja);
        double perimetri2=(2 *Math.PI*rrezja);
        System.out.println("Perimetri float eshte eshte " + perimetri1);
        System.out.println("Perimetri double eshte " + perimetri2);




    }
}
