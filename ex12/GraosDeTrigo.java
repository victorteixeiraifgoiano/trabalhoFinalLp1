package trabalhofinal.ex12;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

public class GraosDeTrigo {
    public static void main(String[] args) {
        double graosCasa = 1, soma = 1;

        for (int i = 2; i <= 64; i++) {
            graosCasa *= 2;
            soma += graosCasa;
        }

        System.out.println("Total de grãos: " + soma);
    }
}
