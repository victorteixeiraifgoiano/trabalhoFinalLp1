package trabalhofinal.ex01;

import java.util.Scanner;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

public class CalcEstoqueMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade mínima da peça: ");
        int min = sc.nextInt();

        System.out.println("Quantidade máxima da peça: ");
        int max = sc.nextInt();

        System.out.println("Estoque médio: " + (min + max) / 2);
    }
}
