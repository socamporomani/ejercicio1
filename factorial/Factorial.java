/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author socamporomani
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1;
        int calculoFactorial;

        numero1 = 8;

        int i;
        if (numero1 == 0) {
            calculoFactorial = 1;
        } else {
            calculoFactorial = 1;
            for (i = numero1; i >= 1; i--) {
                calculoFactorial = calculoFactorial * i;
            }
        }

        System.out.println(calculoFactorial);

    }

}
