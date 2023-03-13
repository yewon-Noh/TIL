import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) array[i] = in.nextInt();
        System.out.println(T.solution(n, array));
    }

    public int solution(int n, int[] array) {
        int answer = 0;

        for (int num: array) {
            int idx = 0;
            if (num==1) continue;
            // 1보다 큰 자연수 중 자신보다 작은 수로 나눠지는지 확인
            for (int i=2; i<num; i++) {
                if (num%i==0) idx=1;
                if (idx==1) break;
            }
            if (idx==0) answer++;
        }
        return answer;
    }
}
