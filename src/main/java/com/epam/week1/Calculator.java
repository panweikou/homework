package com.epam.week1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    Logger logger= java.util.logging.Logger.getLogger(Calculator.class.getName());


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
            logger.info("Please re-enter the second data again: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            b = Double.parseDouble(input);

        }
        return a/b;
    }

    public void calculate() {
        Scanner sc = new Scanner(System.in);
        logger.info("Please enter the first number: ");
        String input = sc.nextLine();
        double a = Double.parseDouble(input);
        while (true) {
            //Input the symbol
            logger.info("Please enter the symbol: ");
            String symbol = sc.nextLine();
            if (symbol.equals("=")) {
                logger.info("The program is end");
                break;
            }
            if(!(symbol.equals("+")||symbol.equals("-")||symbol.equals("*")||symbol.equals("/"))) {
                logger.info("Please the correct symbol + - * /");
                continue;
            }

            //Input the second number
            logger.info("Please enter the second number: ");
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
            String value = String.valueOf(a);
            logger.info(value);
        }
    }

}
