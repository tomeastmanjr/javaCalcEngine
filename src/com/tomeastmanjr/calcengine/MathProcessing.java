package com.tomeastmanjr.calcengine;

public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyWord(); // add
    char getSymbol(); // +
    double doCalculation(double leftVal, double rightVal);

}
