package com.bitwiseglobal.postfix;

/**
 * Created by balajeev on 2/23/2016.
 */
public class Main {

    int result;
    public int inputString(String expression) {

        PostfixValidator validator = new PostfixValidator();

        boolean valid=validator.validate(expression);
        System.out.println("enter into function");
        if (valid) {
            result = evaluatePostfix(expression);

        } else {

            throw new InvalidInputException();

        }
        return result;
    }



    private int evaluatePostfix(String expression) {

        PostfixEvaluator evaluater=new PostfixEvaluator();
        return(evaluater.calculate(expression));
    }

    private class InvalidInputException extends RuntimeException {
    }
}