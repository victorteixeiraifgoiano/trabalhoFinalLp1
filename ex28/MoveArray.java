package trabalhofinal.ex28;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

import java.util.Arrays;
import java.util.Scanner;

public class MoveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão inseridos?");
        int x = sc.nextInt();

        int[] n = new int[x];

        for (int i = 0; i < x; i++) {
            n[i] = sc.nextInt();
        }

        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
    }
}
