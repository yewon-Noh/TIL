import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        T.solution(m, n);
    }

    public void solution(int m, int n) {
        // 에라토스테네스의 체를 통해 소수를 구함
        boolean[] prime = new boolean[n+1];
        prime[0] = true; prime[1] = true;
        for (int i=2; i <= Math.sqrt(prime.length); i++) {
            for (int j=i*i; j< prime.length; j+=i) prime[j] = true;
        }

        int sum = 0, min = Integer.MAX_VALUE;
        for (int i=m; i<=n; i++) {
            if (!prime[i]) {
                sum += i;
                if (i < min) min = i;
            }
        }

        if (sum == 0) System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
