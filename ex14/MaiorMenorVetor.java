package trabalhofinal.ex14;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

import java.util.Scanner;

public class MaiorMenorVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Insira 10 números inteiros positivos:");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            vetor[i] = n;
        }

        System.out.println("Insira o elemento a ser comparado:");
        System.out.println("X:");
        int x = sc.nextInt();

        int maiores = 0, menores = 0, iguais = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > x)
                maiores++;
            else if (vetor[i] < x)
                menores++;
            else
                iguais++;
        }

        System.out.println();
        System.out.println(maiores + " números do vetor são maiores que x.");
        System.out.println(menores + " números do vetor são menores que x.");
        System.out.println(iguais + " números do vetor são iguais a x.");
    }
}
