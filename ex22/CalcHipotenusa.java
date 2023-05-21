package trabalhofinal.ex22;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

import java.util.Scanner;

public class CalcHipotenusa {

    static double hipotenusa(double cat_oposto, double cat_adjascente) {
        return (Math.sqrt(Math.pow(cat_oposto, 2) + Math.pow(cat_adjascente, 2)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa: Calcula hipotenusa.");

        System.out.println("\nInsira o valor do cateto oposto:");
        double cat_oposto = sc.nextDouble();

        System.out.println("Insira o valor do cateto adjascente:");
        double cat_adjascente = sc.nextDouble();

        System.out.println("\nO valor da hipotenusa é: " + hipotenusa(cat_oposto, cat_adjascente));
    }
}
