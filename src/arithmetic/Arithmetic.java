/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();

        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationString = in.next().toUpperCase(); // Read the operation as a string

        try {
            Operation operation = Operation.valueOf(operationString); // Convert the string to an enum
            double result = r.calculate(m, n, operation);
            System.out.println("result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation: " + operationString);
        }
    }
}
