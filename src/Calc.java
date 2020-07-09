import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Scanner;

public class Calc {


    public Object Addition(Object one, Object two) {
        double result = (Double) one + (Double) two;
        return result;
    }
    public Object Subtraction(Object one, Object two) {
        double result = (Double) one - (Double) two;
        return result;
    }
    public Object Multiplication(Object one, Object two) {
        double result = (Double) one * (Double) two;
        return result;
    }
    public Object Division(Object one, Object two) {
        double result = (Double) one / (Double) two;
        return result;
    }
}

