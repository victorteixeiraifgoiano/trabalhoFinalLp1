/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/
package trabalhofinal.ex30;

public class Teste {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("João", 40, null, null);
        Pessoa mae = new Pessoa("Maria", 38, null, null);
        Pessoa filho1 = new Pessoa("Pedro", 18, pai, mae);
        Pessoa filho2 = new Pessoa("Ana", 15, pai, mae);

        pai.setPai(new Pessoa("José", 70, null, null));
        pai.setMae(new Pessoa("Joana", 68, null, null));
        mae.setPai(new Pessoa("Carlos", 65, null, null));
        mae.setMae(new Pessoa("Marta", 63, null, null));

        System.out.println("Árvore Genealógica");
        System.out.println("------------------");
        System.out.println("Pai: " + pai.getNome());
        System.out.println("Mãe: " + mae.getNome());
        System.out.println("Filho 1: " + filho1.getNome());
        System.out.println("Filho 2: " + filho2.getNome());
    }
}
