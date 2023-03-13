import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        // 소수를 찾는다
        boolean[] prime = isPrime();

        // 테스트 케이스를 입력받는다.
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            int x = in.nextInt();

            // 가장 차이가 적은 두 소수를 구한다.
            int lt = x/2, rt = x/2;
            while (true) {
                if (!prime[lt] && !prime[rt]) {
                    System.out.println(lt + " " + rt);
                    break;
                }
                lt--; rt++;
            }

        }
    }

    // 1~10000 중 소수를 찾는다.(에라토스테네스의 체)
    static private boolean[] isPrime() {
        boolean[] prime = new boolean[10001];
        prime[0] = prime[1] = true;
        for (int i=2; i<=Math.sqrt(prime.length); i++) {
            for (int j=i*i; j< prime.length; j+=i) prime[j] = true;
        }
        return prime;
    }
}
