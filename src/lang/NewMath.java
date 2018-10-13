package lang;

/**
 *
 * @author Sávio Andres
 */
public final class NewMath {

    public static final double PI = 3.1415926535897932384626433832795;
    public static final double E = 2.7182818284590452353602874713526;

    private NewMath() {
    }

    public static double raiz(double indice, double raiz) {
        return potencia(raiz, 1 / indice);
    }

    public static double raiz(double raiz) {
        return raiz(2, raiz);
    }

    public static double potencia(double base, int expoente) {
        double x = 1;
        if (expoente >= 0) {
            for (int i = 0; i < expoente; i++) {
                x *= base;
            }
        } else {
            return potencia(1 / base, -expoente);
        }
        return x;
    }

    public static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static boolean primo(int numero) {
        int numDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                numDivisores++;
            }
        }
        return numDivisores == 2;
    }

    public static double delta(double a, double b, double c) {
        return potencia(b, 2) - 4 * a * c;
    }

    public static double[] bhaskara(double a, double b, double c) {
        double[] x = new double[2];
        double raizDelta = raiz(delta(a, b, c));
        x[0] = (-b + raizDelta) / (2 * a);
        x[1] = (-b - raizDelta) / (2 * a);
        return x;
    }

    public static int fatorial(int n) {
        if (n < 0) n = -n;
        return n == 0 ? 1 : n * fatorial(n - 1);
    }

    public static double sen(double x) {
        int n = 1;
        double r = 0;
        boolean o = true;
        while (x != n || x < n) {
            if (o) {
                r = potencia(x, n) / fatorial(n) + r;
            } else {
                r = -potencia(x, n) / fatorial(n) + r;
            }
            n = n + 2;
            o = !o;
        }

        return r;
    }

    public static double cos(double n) {
        return 0;
    }

    public static double tan(double n) {
        return sen(n) / cos(n);
    }

    public static double radianosParaGraus(double radianos) {
        return radianos * (180 / PI);
    }

    public static double grausParaRadianos(double graus) {
        return graus * (PI / 180);
    }

    public static int fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static double log(double x) {
        return log(E, x);
    }
    
    public static double log(double base, double x) {
        double i = 0;
        while (potencia(base, i) < x) {            
            i += 0.000001;
        }
        return i;
    }

    public static int modulo(int n) {
        if(n < 0) n = -n;
        return n;
    }
    
    public static double modulo(double n) {
        if(n < 0) n = -n;
        return n;
    }
    
}
