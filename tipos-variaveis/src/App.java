public class App {
    public static void main(String[] args) throws Exception {

        byte idade = 12; // 1 byte
        short anoFabricacao = 2021; // 2 bytes
        int anoModelo = 2022; // 4 bytes
        long matricula = 123456789L; // 8 bytes

        float pi = 3.14F; // 4 bytes
        double preco = 12.5; // 8 bytes

        boolean verdadeiro = true;
        boolean falso = false;

        char letra = 'a';

        System.out.println(idade);
        System.out.println(anoFabricacao);
        System.out.println(anoModelo);
        System.out.println(matricula);
        System.out.println(pi);
        System.out.println(preco);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(letra);

        // JAVA É FORTEMENTE TIPADO

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        // FINAL DETERMINA O VALOR FINAL DE UMA VARIÁVEL, ENQUANTO ELE NÃO RECEBER ESTE
        // PONTO, ELE SEMPRE PODERÁ SER ALTERADO

        System.err.println(numeroNormal);

        final int numeroFinal = 1;
        System.err.println(numeroFinal);

        // numeroFinal = 2;

        String nome = "Joaquim";
        String nome2 = new String("Joaquim");

        System.err.println(nome);
        System.err.println(nome2);

    }
}
