import java.util.*;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(T.solution(n, k, array));
    }

    public int solution(int n, int k, int[] array) {
        int answer = -1;

        // Set은 중복된 값을 자동으로 제거한다.
        // TreeSet을 이용하면 중복 제거 및 정렬을 할 수 있다.
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());  // Collections.reverseOrder() - 내림차순

        // 카드 세장의 합을 저장한다.
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int z=j+1; z<n; z++) {
                    treeSet.add(array[i]+array[j]+array[z]);
                }
            }
        }

        /**
         * [추가] TreeSet 함수
         * - treeSet.remove(x) : 원소 x를 삭제한다.
         * - treeSet.size() : 원소의 개수를 반환한다.
         * - treeSet.first() : 오름차순의 경우 최솟값, 내림차순의 경우 최대값을 반환한다.(맨 처음의 원소를 반환)
         * - treeSet.last() : first()와 반대로 가장 마지막 원소를 반환한다.
         */

        // k번째를 구한다.
        int cnt = 1;
        for (int x: treeSet) {
            if (cnt == k) return x;
            cnt++;
        }
        return answer;
    }
}