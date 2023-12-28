import constructors.Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Pessoa Teste = new Pessoa("005.5484.224-58", "Tom");

        System.out.println(Teste.getNome());
    }
}