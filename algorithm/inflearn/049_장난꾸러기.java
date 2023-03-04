import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) array[i] = in.nextInt();
        for (int i: T.solution(n, array)) System.out.print(i + " ");
    }

    public ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();

        // tmp라는 배열에 값을 복사한 뒤, 정렬한다.
        int tmp[] = array.clone();
        Arrays.sort(tmp);

        // array와 tmp를 비교하여 다른 경우 answer에 추가한다.
        for (int i=0; i<n; i++) {
            if (array[i] != tmp[i]) answer.add(i+1);
        }
        return answer;
    }
}
