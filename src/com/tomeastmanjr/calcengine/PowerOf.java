package com.tomeastmanjr.calcengine;

/**
 * Created by Tom on 7/27/18
 */
public class PowerOf implements MathProcessing {
    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {

        return Math.pow(leftVal, rightVal);
    }
}
