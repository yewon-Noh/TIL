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

        // 선택 정렬
        for (int i=0; i<n; i++) {
            // 1. 주어진 배열 중에서 최솟값을 찾는다.
            int min=answer[i], index=i;
            for (int j=i+1; j<n; j++) {
                if (answer[j] < min) {
                    min = answer[j];
                    index = j;
                }
            }
            // 2. 그 값을 맨 앞에 위치한 값과 교체한다.
            if (i != index) {
                int tmp = answer[i];
                answer[i] = min;
                answer[index] = tmp;
            }
            // 3. 맨 처음 위치를 뺀 나머지를 같은 방법으로 반복한다.
        }
        return answer;
    }
}
