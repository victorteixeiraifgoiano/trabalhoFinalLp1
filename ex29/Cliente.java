
/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}