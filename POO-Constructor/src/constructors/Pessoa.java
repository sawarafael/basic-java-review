package constructors;

public class Pessoa {
    private String nome;
    private String CPF;
    private String endereco;

    public Pessoa (String cpf, String nome) {
        this.CPF = cpf;
        this.nome = nome;
    };

    public String getNome() {
        return nome;
    };

    public String getCPF() {
        return CPF;
    };

    public String getEndereco() {
        return endereco;
    };

};
