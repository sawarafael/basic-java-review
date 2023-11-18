public class App {
    public static void main(String[] args) throws Exception {
        // OPERADORES ARITMÉTICOS

        int a = 3;
        int b = 4;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // OPERADORES RELACIONAIS

        int x = 3;
        int y = 4;

        boolean menor = x < y;
        boolean maior = x > y;
        boolean igual = x == y;
        boolean diferente = x != y;

        System.out.println(menor);
        System.out.println(maior);
        System.out.println(igual);
        System.out.println(diferente);

        // OPERADORES LOGICOS

        boolean and = (x > 0) && (y > 0);
        boolean or = (x > 0) || (y > 0);
        boolean not = !(x > 0);

        System.out.println(and);
        System.out.println(or);
        System.out.println(not);

        // OPERADORES BITWISE

        int h = 60; // 60 = 0011 1100
        int i = 13; // 13 = 0000 1101

        int j = h & i;
        int k = h | i;
        int l = h ^ i;
        int m = ~i;
        int n = h << 2;
        int o = h >> 2;

        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

        // OPERADORES UNARIOS

        int p = 5;

        int q = +p;
        int r = -p;

        System.out.println(q);
        System.out.println(r);

        // OPERADORES TERNÁRIOS

        int t = 10;
        int u = 20;

        int v = (t > u) ? t : u;

        System.out.println(v);

        // OPERADORES DE ATRIBUIÇÃO

        int w = 10;

        w += 5;

        System.out.println(w);

        // OPERADORES DE INCREMENTO

        int x1 = 10;

        x1++;
        x1++;

        System.out.println(x1);

        // OPERADORES DE DECREMENTO

        int y1 = 10;

        y1--;
        y1--;

        System.out.println(y1);

        // OPERADORES DE ACESSO

        int z = 10;

        System.out.println(z++);
        System.out.println(z);

        System.out.println(++z);
        System.out.println(z);

        // OPERADORES DE CONDICIONAL

        int a1 = 10;
        int b1 = 20;

        int c1 = (a1 > b1) ? a1 : b1;

        System.out.println(c1);

    }
}
