package lv.tsi;

import lv.tsi.animals.Animals;

public class Main {

    public static void main(String[] args) {
        System.out.println(" >>> Gravity calculator:");
        GravityCalculator grCal = new GravityCalculator();
        grCal.main();

        System.out.println("\n >>> Factorial calculator:");
        FactorialCalculator facCal = new FactorialCalculator();
        facCal.main();

        System.out.println("\n >>> One dimensional array:");
        OneDimensionalArray arrOD = new OneDimensionalArray();
        arrOD.main();

        System.out.println("\n >>> Marathon:");
        Marathon table = new Marathon();
        table.main();

        System.out.println("\n >>> Two dimensional array:");
        TwoDimensionalArray arrTD = new TwoDimensionalArray();
        arrTD.main();

        System.out.println("\n >>> Animals:");
        Animals myZoo = new Animals();
        myZoo.main();
    }
}