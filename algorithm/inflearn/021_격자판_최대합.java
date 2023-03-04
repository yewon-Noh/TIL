import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, array));
    }

    public int solution(int n, int[][] array) {
        int answer = 0;

        int sum1, sum2;
        // 각 행(sum1) 및 열(sum2)의 합 계산
        for (int i=0; i<n; i++) {
            sum1 = sum2 = 0;
            for (int j=0; j<n; j++) {
                sum1 += array[i][j];
                sum2 += array[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // 두 대각선의 합 계산
        // sum1 => 0,0 1,1 2,2 3,3 4,4
        // sum2 => 4,0 3,1 2,2 1,3 0,4
        sum1 = sum2 = 0;
        for (int i=0; i<n; i++) {
            sum1 += array[i][i];
            sum2 += array[n-1-i][i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}