package trabalhofinal.ex03;

import java.util.Scanner;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

public class RelacionaInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe três números inteiros:");

        int[] n = new int[3];
        System.out.println("N1:");
        n[0] = sc.nextInt();
        System.out.println("N2:");
        n[1] = sc.nextInt();
        System.out.println("N3:");
        n[2] = sc.nextInt();

        // Testes
        int j = 0;
        int k = 1;
        for (int i = 0; i < n.length; i++) {
            System.out.println();
            if (n[j] == n[k])
                System.out.println("N" + (j + 1) + " é igual a N" + (k + 1) + ".");
            if (n[j] != n[k])
                System.out.println("N" + (j + 1) + " é diferente de N" + (k + 1) + ".");
            if (n[j] > n[k])
                System.out.println("N" + (j + 1) + " é maior que N" + (k + 1) + ".");
            if (n[j] < n[k])
                System.out.println("N" + (j + 1) + " é menor que N" + (k + 1) + ".");
            if (n[j] >= n[k])
                System.out.println("N" + (j + 1) + " é maior ou igual a N" + (k + 1) + ".");
            if (n[j] <= n[k])
                System.out.println("N" + (j + 1) + " é menor ou igual a N" + (k + 1) + ".");

            j++;
            if (k == 2)
                j = 0;
            else
                k++;
        }

    }
}
