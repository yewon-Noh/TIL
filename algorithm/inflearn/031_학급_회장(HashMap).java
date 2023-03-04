import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();  // 투표용지 수
        String str = in.next();
        System.out.println(T.solution(n, str));
    }

    // HashMap을 사용해 풀이
    public char solution(int n, String str) {
        char answer = ' ';

        // HaspMap 선언
        HashMap<Character, Integer> map = new HashMap<>();
        // HashMap에 후보별 투표 개수 저장
        for (char x: str.toCharArray()) {
            // map.getOrDefault(key, defaultValue) : key에서 값을 가져오되 없으면 0을 반환
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        /**
         * [추가] HaspMap 함수
         * - map.containsKey(key) :  key가 있는지 검증한다.
         * - map.size() : key의 개수를 반환한다.
         * - map.remove(key) : key를 삭제한다.
         */
//        System.out.println("map.containsKey('A') = " + map.containsKey('A'));
//        System.out.println("map.size() = " + map.size());
//        map.remove('A');

        // 선출된 학습회장 결과 구하기
        int max = Integer.MIN_VALUE;
        // map.keySet() : map 객체를 탐색한다.
        for (char key: map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}