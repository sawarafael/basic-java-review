public class App {
    public static void main(String[] args) throws Exception {

        // Sempre seguir com o CammelCase

        // METODOS

        int a = 3;
        int b = 4;

        int c = somar(a, b);
        int d = subtrair(a, b);
        int e = multiplicar(a, b);
        int f = dividir(a, b);
        int g = resto(a, b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        SmartTv smartTv = new SmartTv();

        System.out.println("Ligado: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int resto(int a, int b) {
        return a % b;
    }

    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    public static void imprimirNumero(int numero) {
        System.out.println(numero);
    }

}
