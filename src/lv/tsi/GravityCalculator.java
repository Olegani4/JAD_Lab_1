package lv.tsi;

import java.util.Scanner;
import java.lang.Math;

public class GravityCalculator {
    private static final double GRAVITY = -9.81;
    private double initialPosition = 0;
    private double initialVelocity = 0;
    private double position;
    private int fallingTime = 0;

    public void setFallingTime(String fallingTime) {
        this.fallingTime = Integer.parseInt(fallingTime);
    }

    public void setInitialPosition(String initialPosition) {
        this.initialPosition = Double.parseDouble(initialPosition);
    }

    public void setInitialVelocity(String initialVelocity) {
        this.initialVelocity = Double.parseDouble(initialVelocity);
    }

    public int getFallingTime() {
        return fallingTime;
    }

    public double getPosition() {
        return position;
    }

    public void findPosition() {
        position = (Math.pow(fallingTime, 2) * GRAVITY * 0.5 + initialVelocity * fallingTime + initialPosition);
    }


    public void main() {
        Scanner scn = new Scanner(System.in);

        setFallingTime(scn.nextLine());
        setInitialPosition(scn.nextLine());
        setInitialVelocity(scn.nextLine());

        findPosition();
        System.out.println("Position in " + getFallingTime() + " seconds: " + getPosition());
    }
}