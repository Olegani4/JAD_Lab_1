package lv.tsi;

import java.util.Random;

public class TwoDimensionalArray {
    double[][] createRandomArray(int size) {
        double[][] array_2D = new double[size][size];

        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array_2D[i][j] = rand.nextDouble(0, 100);
                System.out.print(array_2D[i][j] + "   ");
            }
            System.out.print('\n');
        }
        return array_2D;
    }

    double mean_1D(double[] array_1D) {
        double meanVal = 0;
        for (int i = 0; i < array_1D.length; i++) {
            meanVal += array_1D[i];
        }
        return meanVal / array_1D.length;
    }

    public void main() {
        double[][] array_2D = createRandomArray(4);
        System.out.println("\nColumn\tAverage value");
        for (int i = 0; i < array_2D.length; i++) {
            System.out.println(i + 1 + "\t    " + mean_1D(array_2D[i]));
        }
    }
}