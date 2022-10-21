package lv.tsi;

public class FactorialCalculator {

    public double forLoopFacCalc(int n) {
        double result = 1;
        for (int i = 0; i != n; i++) {
            result *= n - i;
        }
        return result;
    }

    public double recurFacCalc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recurFacCalc(n - 1);
    }

    public void main() {
        System.out.println(forLoopFacCalc(5));
        System.out.println(recurFacCalc(5));
    }
}