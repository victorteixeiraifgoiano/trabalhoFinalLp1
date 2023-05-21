package trabalhofinal.ex06;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

import java.util.Scanner;

public class MultiplicaMaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[3];
        System.out.println("Informe três números inteiros maiores que 0:");

        for (int i = 0; i < n.length; i++) {
            System.out.println("N" + (i + 1));
            n[i] = sc.nextInt();
            while (n[i] <= 0) {
                System.out.println("Valor inválido, insira um valor positivo:");
                System.out.println("N" + (i + 1));
                n[i] = sc.nextInt();
            }
        }

        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE;
        for (int j : n) {
            menor = j < menor ? j : menor;
            maior = j > maior ? j : maior;
        }

        System.out.println("Maior valor dividido pelo menor = " + (maior / menor));
        System.out.println("Menor valor vezes o maior = " + (menor * maior));
    }
}