import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();  // 첫번째 원소
        int[] array1 = new int[n];
        for (int i=0; i<n; i++) {
            array1[i] = in.nextInt();
        }
        int m = in.nextInt();  // 두번째 원소
        int[] array2 = new int[m];
        for (int i=0; i<m; i++) {
            array2[i] = in.nextInt();
        }

        for (int x: T.solution(n, m, array1, array2)) {
            System.out.print(x + " ");
        }
    }

    /**
     * 투포인트 기법을 사용한다.
     *
     * [기타]
     * 처음에는 이중 for문을 통해 공통 원소를 구한 뒤, Collections.sort()로 정렬하였으나
     * Time Limit Exceed가 발생하였다.
     * @param n
     * @param m
     * @param array1
     * @param array2
     * @return
     */
    public ArrayList<Integer> solution(int n, int m, int[] array1, int[] array2) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 두 배열을 오름차순으로 정렬한다.
        Arrays.sort(array1); Arrays.sort(array2);

        int p1=0, p2=0;
        while (p1<n && p2<m) {
            // array1[p1]의 원소가 array2[p2]의 원소보다 작은 경우 p1을 1증가시킨다.
            // 오른차순으로 정렬되어 있기 때문에, 앞으로 array2[p2~]에서 array1[p1]의 값을 가지지 않기 때문이다.
            if (array1[p1] < array2[p2]) p1++;
            else if (array1[p1] > array2[p2]) p2++;
            // 두 배열의 원소가 같으면 answer에 저장하고 p1, p2를 1증가시킨다.
            else {
                answer.add(array1[p1]);
                p1++; p2++;
            }
        }
        return answer;
    }
}