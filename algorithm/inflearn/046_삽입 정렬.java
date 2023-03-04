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
        // 삽입 정렬
        // : 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입.
        // 두 번째 카드부터 반복한다.
        for (int i=1; i<n; i++) {
            // i번째 보다 앞에 있는 카드를 비교한다.
            for (int j=i-1; j>=0; j--) {
                // 두 카드를 비교하여 정렬한다.
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }
}
