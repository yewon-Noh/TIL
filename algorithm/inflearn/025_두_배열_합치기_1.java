import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();  // 첫번째 배열
        int[] array1 = new int[n];
        for (int i=0; i<n; i++) {
            array1[i] = in.nextInt();
        }
        int m = in.nextInt();  // 두번째 배열
        int[] array2 = new int[m];
        for (int i=0; i<m; i++) {
            array2[i] = in.nextInt();
        }

        for (int x: T.solution(array1, array2)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int[] array1, int[] array2) {
        int[] answer = new int[array1.length + array2.length];

        // 배열 합치기
        // System.arraycopy(복사할 배열, 복사할 배열의 시작 인덱스, 붙여넣을 배열, 붙여넣을 배열의 시작 인덱스, 복사할 배열의 길이)
        System.arraycopy(array1, 0, answer, 0, array1.length);
        System.arraycopy(array2, 0, answer, array1.length, array2.length);

        Arrays.sort(answer);

        return answer;
    }
}