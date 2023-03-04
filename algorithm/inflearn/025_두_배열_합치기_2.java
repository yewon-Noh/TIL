import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();  // 첫번째 배열
        Integer[] array1 = new Integer[n];
        for (int i=0; i<n; i++) {
            array1[i] = in.nextInt();
        }
        int m = in.nextInt();  // 첫번째 배열
        Integer[] array2 = new Integer[m];
        for (int i=0; i<m; i++) {
            array2[i] = in.nextInt();
        }

        for (int x: T.solution(array1, array2)) {
            System.out.print(x + " ");
        }
    }

    public Integer[] solution(Integer[] array1, Integer[] array2) {
        // Stream API를 이용해 두 배열을 합칠 수 있다.
        // 단, 테스트 결과 366ms로 긴 시간이 소요되므로 (지금은)사용하지 않아야 할 듯하다.
        Integer[] answer = Stream
                .concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray(Integer[]::new);

        return answer;
    }
}