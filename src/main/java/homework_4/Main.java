package homework_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(new ArrayList<>(Arrays.asList(10,2,1))));
        System.out.println(calculator.divide(new ArrayList<>(Arrays.asList(10.0,2f,1))));
        System.out.println(calculator.multiply(new ArrayList<>(Arrays.asList(10.0,2,1f))));

    }
}
