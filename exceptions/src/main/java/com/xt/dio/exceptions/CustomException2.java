package com.xt.dio.exceptions;

import javax.swing.*;

public class CustomException2 {

    public static void main(String[] args){
        int[] numbered = {4, 5, 8, 10};
        int[] denominator = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominator.length; i++) {
            try {
                if(numbered[i] %2 != 0)
                    throw new DivisionByZeroException("Divisão não exata!", numbered[i], denominator[i]);

                int resultado = numbered[i] / denominator[i];
                System.out.println(resultado);
            } catch (DivisionByZeroException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("O programa continua...");
    }
}
