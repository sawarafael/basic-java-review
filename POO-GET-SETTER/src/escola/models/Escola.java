package escola.models;

public class Escola {

    public static void main (String[] args) {
        Aluno estudante = new Aluno();

        estudante.setNome("Felipe");
        estudante.setIdade(8);

        System.out.println("O Aluno registrado é: " + estudante.getNome() + " e tem: " + estudante.getIdade() + " anos de idade.");
    }
}
