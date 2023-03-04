import java.util.ArrayList;
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

        for (int x: T.solution(n, m, array1, array2)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int m, int[] array1, int[] array2) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 두 배열의 첫번째 포지션을 가리킨다.
        int p1=0, p2=0;

        // 두 배열의 값을 비교하면서 더 작은 값을 answer에 추가한다.(오름차순 정렬을 위함)
        // 단, 각 배열의 포지션 값이 배열의 길이보다 작을 순 없다.
        while (p1<n && p2<m) {
            if (array1[p1] < array2[p2]) answer.add(array1[p1++]);
            else answer.add(array2[p2++]);
        }

        // 배열의 포지션 값이 길이보다 작은 경우, 값이 모두 복사된 것이 아니므로
        // 남은 값을 answer에 추가한다.
        while (p1<n) answer.add(array1[p1++]);
        while (p2<m) answer.add(array2[p2++]);

        return answer;
    }
}