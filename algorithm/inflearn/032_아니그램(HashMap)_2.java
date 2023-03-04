// 강의 풀이
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        System.out.println(T.solution(first, second));
    }

    public String solution(String first, String second) {
        // 첫번째 문자열에 대한 단어(알파벳)와 개수를 HashMap에 저장한다.
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x: first.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        // 두번째 문자열의 단어와 개수가 map(첫번째 문자열에 대한 값)과 일치하는지 확인한다.
        for (char x: second.toCharArray()) {
            if (
                    !map.containsKey(x) ||  // key가 존재하지 않는 경우
                            map.get(x)==0   // key가 존재하나 개수가 0인 경우
                                            // (첫번째 문자열보다 해당 단어가 더 많이 나옴을 의미함)
            ) return "NO";                  // "NO"를 반환한다.

            // map에 저장된 개수를 하나 줄인다.
            map.put(x, map.get(x)-1);
        }
        return "YES";
    }
}