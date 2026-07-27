package oppsee05;

class Fibonacci {
    static void main(String[] args) {
        System.out.println(Fibonacci.berechneFibonacci(92));
    }
    /**
     * Berechnet die n-te Zahl der Fibonacci-Folge iterativ.
     *
     * f(n) = f(n-1) + f(n-2) für n > 2
     * f(1) = 1
     * f(2) = 1
     *
     * @param n Parameter n der Gleichung
     * @throws IllegalArgumentException - if n < 1
     * @return n-te Zahl der Fibonacci-Folge
     */

    public static int berechneFibonacci(int n){
        if (n < 1) throw new IllegalArgumentException();
        int prev2 = 0;
        int prev1 = 0;
        int current = 1;
        for (int i = 0; i < n; i++) {
            current = (i < 2) ? 1 : prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
