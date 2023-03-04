import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }

    /**
     * 에라토스테네스의 체
     * “소수가 되는 수의 배수를 지우면 남은 건 소수가 된다”라고 생각하는 알고리즘이다.
     * 소수를 구하는 방법 중 가장 빠르다고 한다.
     
     * 자세한 설명은 https://firework-ham.tistory.com/8
     * @param n
     * @return
     */
    public int solution(int n) {
        int answer = 0;  // 소수의 개수

        int[] ch = new int[n+1];  // int 배열의 초기값은 0임
        for (int i=2; i<=n; i++) {
            // 배열에 저장된 값이 0인 것만 확인한다.
            // 1인 경우는 지워진 것과 같다.
            if (ch[i] == 0) {
                answer++;

                // i의 배수를 모두 지운다.
                for (int j=i; j<=n; j=j+i) ch[j]=1;
            }
        }

        return answer;
    }
}