package com.epam.week1;
import java.util.Scanner;

public class Calculator {
    public Calculator () {}


    /**
     * a+b
     * @param a The first number
     * @param b The second number
     * @return
     */
    public double  addition(double a,double b) {
        return a+b;
    }

    /**
     * a-b
     * @param a
     * @param b
     * @return
     */
    public double subtraction(double a, double b) {
        return a-b;
    }

    /**
     * a*b
     * @param a
     * @param b
     * @return
     */
    public double multiplication(double a, double b) {
        return a*b;
    }


    /**
     * a/b
     * @param a
     * @param b
     * @return
     */
    public double division(double a, double b) {
        if(b==0.0) {
            System.out.println("Please re-enter the second data again: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            b = Double.parseDouble(input);

        }
        return a/b;
    }

    public void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        String input = sc.nextLine();
        double a = Double.parseDouble(input);
        while (true) {
            //Input the symbol
            System.out.println("Please enter the symbol: ");
            String symbol = sc.nextLine();
            if (symbol.equals("=")) {
                System.out.println("The program is end");
                break;
            }
            if(!(symbol.equals("+")||symbol.equals("-")||symbol.equals("*")||symbol.equals("/"))) {
                System.out.println("Please the correct symbol + - * /");
                continue;
            }

            //Input the second number
            System.out.println("Please enter the second number: ");
            String input1 = sc.nextLine();
            double b = Double.parseDouble(input1);
            switch (symbol) {
                case "+":
                    a = this.addition(a,b);
                    break;
                case "-":
                    a = this.subtraction(a,b);
                    break;
                case "*":
                    a = this.multiplication(a,b);
                    break;
                case "/":
                    a = this.division(a,b);
                    break;
            }
            System.out.println(a);

        }
    }

}
