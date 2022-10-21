package lv.tsi;

import java.util.Random;

public class OneDimensionalArray {
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

    double mean(double[][] array_2D) {
        double meanVal = 0;
        for (int i = 0; i < array_2D.length; i++) {
            for (int j = 0; j < array_2D.length; j++) {
                meanVal += array_2D[i][j];
            }
        }
        return (meanVal / (array_2D.length * array_2D.length));
    }

    double max(double[][] array_2D) {
        double maxVal = array_2D[0][0];
        for (int i = 0; i < array_2D.length; i++) {
            for (int j = 0; j < array_2D.length; j++) {
                if (array_2D[i][j] > maxVal) {
                    maxVal = array_2D[i][j];
                }
            }
        }
        return maxVal;
    }

    double min(double[][] array_2D) {
        double minVal = array_2D[0][0];
        for (int i = 0; i < array_2D.length; i++) {
            for (int j = 0; j < array_2D.length; j++) {
                if (array_2D[i][j] < minVal) {
                    minVal = array_2D[i][j];
                }
            }
        }
        return minVal;
    }

    public void main() {
        double[][] array_2D = createRandomArray(4);
        System.out.println("Array average: " + mean(array_2D));
        System.out.println("Array max value: " + max(array_2D));
        System.out.println("Array min value: " + min(array_2D));
    }
}