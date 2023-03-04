import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        for (int i: T.solution(n)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n) {
        int[] answer = new int[n];

        // n의 범위는 3<=n<=45
        // 0~1번째는 무조건 1임
        answer[0] = 1;
        answer[1] = 1;

        for (int i=2; i<n; i++) {
            // 앞의 두 수를 더해 저장
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }
}