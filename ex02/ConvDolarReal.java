package trabalhofinal.ex02;

import java.util.Scanner;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

public class ConvDolarReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a cotação atual do dólar? ");
        float cot = sc.nextFloat();

        System.out.println("Informe um valor em dólares: ");
        float dol = sc.nextFloat();

        System.out.println("O valor em reais será: " + (dol * cot));
    }
}
