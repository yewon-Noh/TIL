import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) array[i]=in.nextInt();
        for (int i: T.solution(n, array)) System.out.print(i + " ");
    }

    public int[] solution(int n, int[] array) {
        int[] answer = array;

        // 버블 정렬
        // : 서로 인접한 두 원소를 검사하여 정렬한다.
        for (int i=0; i<n-1; i++) {  // i: 반복횟수
            // 0~n-1까지 반복한다.
            // 1회전이 끝나면 가장 끝에는 가장 큰 수가 남으므로 제외하고 계속한다.
            // 즉, 비교 개수가 점점 줄어든다.
            for (int j=0; j<n-i-1; j++) {
                if (answer[j] > answer[j+1]) {
                    int tmp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = tmp;
                }
            }
        }
        return answer;
    }
}
