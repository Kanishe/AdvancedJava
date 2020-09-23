package main;

public class Fibon {
    public static void main(String[] args) {
        System.out.println(fibNave(3));
        System.out.println(fibNave(5));
        System.out.println(fibNave(10));

        System.out.println(effectiveAlg(10));
        System.out.println(effectiveAlg(100));


    }
    private static long fibNave(int c){
        if (c<=1)
            return c;
        return fibNave(c-1) + fibNave(c-2);
    }
    private static long effectiveAlg(int n){
        long [] arr = new long [n+1];
        arr [0] = 0;
        arr [1] = 1;

        for (int i = 2; i<=n;i++)

            arr[i] = arr [i - 1] + arr [i - 2];

                    return arr [n];

    }
}
