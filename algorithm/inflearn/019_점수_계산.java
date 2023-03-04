import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(T.solution(array));
    }

    public int solution(int[] array) {
        int answer = 0;

        // cnt에 이전 점수를 기록한다.
        int cnt = 0;
        for (int x: array) {
            if (x == 1) {
                // 정답인 경우, 이전 점수에 1을 더해 점수를 합산한다.
                cnt += 1;
                answer += cnt;

            } else {
                // 오답인 경우, 이전 점수를 0으로 초기화 한다.
                cnt = 0;
            }
        }
        return answer;
    }
}