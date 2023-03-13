import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        for (int i=0; i<N; i++) array[i] = in.nextInt();
        for (int i: T.solution(N, array)) System.out.println(i);
    }

    public int[] solution(int N, int[] array) {
        int[] answer = array;

        for (int i=0; i<N; i++) {
            // 최솟값을 찾는다.
            int index = i;
            for (int j=i; j<N; j++)
                if (answer[j] < answer[index]) index = j;
            // 가장 앞의 수와 교체한다.
            int tmp = answer[i];
            answer[i] = answer[index];
            answer[index] = tmp;
        }
        return answer;
    }
}
