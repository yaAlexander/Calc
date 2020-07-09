import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Scanner;

public class Calc {


    public Object addition(Object one, Object two) {
        double result = (Double) one + (Double) two;
        return result;
    }
    public Object subtraction(Object one, Object two) {
        double result = (Double) one - (Double) two;
        return result;
    }
    public Object multiplication(Object one, Object two) {
        double result = (Double) one * (Double) two;
        return result;
    }
    public Object division(Object one, Object two) {
        double result = (Double) one / (Double) two;
        return result;
    }
}

