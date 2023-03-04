import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        Integer[] array = new Integer[n];
        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }
        for (int x: T.solution(n, array)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int n, Integer[] array) {
        int[] answer = new int[n];

        // Integer[] sorted = array; // 얇은 복사이므로 값이 변경됨

        // 깊은 복사 - 1
//        Integer[] sorted = new Integer[n];
//        for (int i=0; i<n; i++) {
//            sorted[i] = array[i];
//        }

        // 깊은 복사 - 2
        Integer[] sorted = Arrays.copyOf(array, array.length);

        // 오름차순 정렬
        Arrays.sort(sorted, Collections.reverseOrder());

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(array[i] == sorted[j]) {
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }
}