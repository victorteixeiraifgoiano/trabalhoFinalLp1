package trabalhofinal.ex21;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'x', 'w', 'y', 'z' };

        System.out.println("Insira o primeiro caractere:");
        char c1 = sc.next().toLowerCase().charAt(0);

        System.out.println("Insira o segundo caractere:");
        char c2 = sc.next().toLowerCase().charAt(0);

        int posicaoc1 = 0;
        for (char c : alfabeto) {
            if (c1 == c)
                break;
            else
                posicaoc1++;
        }

        int posicaoc2 = 0;
        for (char c : alfabeto) {
            if (c2 == c)
                break;
            else
                posicaoc2++;
        }

        int diferenca = posicaoc2 - posicaoc1;
        if (diferenca > 0)
            System.out.println("\nExistem " + (diferenca - 1) + " letras entre " + c1 + " e " + c2 + ".");
        else
            System.out.print("Erro!");
    }
}
