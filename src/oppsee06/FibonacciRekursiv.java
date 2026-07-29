package oppsee06;

public class FibonacciRekursiv {
    public static void main(String[] args) {
        System.out.println(berechneFibonacciRekursiv(5));
    }
    /**
     * Berechnet die n-te Zahl der Fibonacci-Folge rekursiv.
     *
     * f(n) = f(n-1) + f(n-2) für n > 2
     * f(1) = 1, f(2) = 1
     *
     * @param n Parameter n der Gleichung
     * @throws IllegalArgumentException - if n < 1
     * @return n-te Zahl der Fibonacci-Folge
     */
    public static int berechneFibonacciRekursiv(int n){
        if(n < 1) throw new IllegalArgumentException();
        if (n <= 2) return 1;
        return berechneFibonacciRekursiv(n-2) + berechneFibonacciRekursiv(n-1);
    }
}
