public class App {
    public static void main(String[] args) throws Exception {

        byte idade = 12; // 1 byte
        short anoFabricacao = 2021; // 2 bytes
        int anoModelo = 2022; // 4 bytes
        long matricula = 123456789L; // 8 bytes

        float pi = 3.14F; // 4 bytes
        double preco = 12.5; // 8 bytes

        // JAVA É FORTEMENTE TIPADO

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        // FINAL DETERMINA O VALOR FINAL DE UMA VARIÁVEL, ENQUANTO ELE NÃO RECEBER ESTE
        // PONTO, ELE SEMPRE PODERÁ SER ALTERADO
    }
}
