import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt(); // N일 동안의 매출 기록
        int k = in.nextInt(); // 연속 K일
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }
        for (Integer i: T.solution(n, k, array)) {
            System.out.print(i + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int k, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        // 첫번째 구간
        for (int i=0; i<k; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
        }
        answer.add(map.size());

        // 두번째 구간 ~ (슬라이딩 윈도우)
        int lt=0;
        for (int rt=k; rt<n; rt++) {
            // 왼쪽 하나 빼고
//            if (map.containsKey(array[lt]) == true) {  // 여기서는 무조건 키가 존재하는 경우만 있기 때문에 불필요.
                map.put(array[lt], map.get(array[lt])-1);
                if (map.get(array[lt]) == 0)  map.remove(array[lt]);
                lt++;
//            }
            // 오른쪽 하나 추가
            map.put(array[rt], map.getOrDefault(array[rt], 0)+1);
            // 매출액의 종류 저장
            answer.add(map.size());
        }
        
        /**
         * [참고]
         * 강의에서는 먼저 k-1까지를 map에 저장해두고
         * 두번째 for문에서 아래의 순서를 반복하였다.
         * * 1. 오른쪽의 값 하나를 추가한다.
         * * 2. map의 size를 저장한다.
         * * 3. 왼쪽의 값 하나를 뺀다.
         */

        return answer;
    }
}