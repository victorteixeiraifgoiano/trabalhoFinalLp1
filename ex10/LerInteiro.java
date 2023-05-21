package trabalhofinal.ex10;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

import java.util.Scanner;

public class LeInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean encerrar = false;
        do {
            System.out.println("Informe um número inteiro:");
            int n = sc.nextInt();

            if ((n % 2) == 0)
                System.out.print("O número " + n + " é par");
            else
                System.out.print("O número " + n + " é ímpar");

            if (n < 0)
                System.out.print(" e negativo.");
            else
                System.out.print(" e positivo.");

            System.out.println("\nDeseja encerrar o programa? (S/N)");
            char condicao = sc.next().charAt(0);

            while (condicao != 'S' && condicao != 'N') {
                System.out.println("Resposta inválida.");
                condicao = sc.next().charAt(0);
            }
            if (condicao == 'S')
                encerrar = true;
        } while (encerrar == false);
    }
}
