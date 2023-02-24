package Java101Hw;

import java.util.Scanner;
public class ManavKasa {

    public static void main(String[] args) {

        double Armut, Elma, Domates, Muz, Patlıcan, ToplamUcret;

        Armut = 2.14;
        Elma = 3.67;
        Domates = 1.11;
        Muz = 0.95;
        Patlıcan = 5.00;

        System.out.print("Armut Kaç Kilo ? : ");
        Scanner inputA = new Scanner(System.in);
        Armut = inputA.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        Scanner inputE = new Scanner(System.in);
        Elma = inputE.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        Scanner inputD = new Scanner(System.in);
        Domates = inputD.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        Scanner inputM = new Scanner(System.in);
        Muz = inputM.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        Scanner inputP = new Scanner(System.in);
        Patlıcan = inputP.nextDouble();

        ToplamUcret = (Armut * 2.14) + (Elma * 3.67) + (Domates * 1.11) + (Muz * 0.95) + (Patlıcan * 5.00);

        System.out.print("Toplam Tutar : "+ToplamUcret);
        System.out.print(" TL");
    }
}
