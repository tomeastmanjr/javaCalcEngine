package com.tomeastmanjr.calcengine;

/**
 * created by Tom on 7/24/2018
 */

public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    // getters and setters
    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }

    /**
        Blank constructor
     */
    public MathEquation() {}

    /**
        Constructor for passing in an opCode
     */
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    /**
        Constructor to accept leftVal, rightVal and opCOde
     */
    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    /**
        Perform math equations
     */
    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result =  rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }

    /**
     * Perform the math equations and accept the left and right values
     * @param leftVal is the value on the left
     * @param rightVal is the value on the right
     */
    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    /**
     * Perform the math equations with int instead of double
     * @param leftVal is the value on the left
     * @param rightVal is the value on the right
     */
    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();

        result = (int)result;
    }

}
