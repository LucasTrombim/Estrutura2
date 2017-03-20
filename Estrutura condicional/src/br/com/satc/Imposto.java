package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Imposto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor do produto?");
        float valor = input.nextFloat();
        System.out.println("O seu produto é nacional ou importado?");
        String decisao = input.next();
        if (decisao.toUpperCase().equals("NACIONAL") && (valor < 1000)) {
            System.out.println("O valor pago é: " + (valor * 1.10));
            System.out.println("O valor sem o imposto é: " + ((valor * 1.10) - valor));
        } else if (decisao.toUpperCase().equals(("NACIONAL")) && (valor >= 1000)) {
            System.out.println("O valor pago é: " + (valor * 1.15));
            System.out.println("O valor sem o imposto é: " + ((valor * 1.15) - valor));
        } else if (decisao.toUpperCase().equals("IMPORTADO")) {
            System.out.println("O valor pago é: " + (valor * 1.50));
            System.out.println("O valor sem o imposto é: " + ((valor * 1.5) - valor));

        }

    }

}
