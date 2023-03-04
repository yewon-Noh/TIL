import java.util.HashMap;
import java.util.HashSet;
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
        // 각 문자열에서 단어(알파벳)와 개수를 HashMap에 저장한다.
        HashMap<Character, Integer> firstMap = new HashMap<>();
        for (char x: first.toCharArray()) {
            firstMap.put(x, firstMap.getOrDefault(x, 0)+1);
        }

        HashMap<Character, Integer> secondMap = new HashMap<>();
        for (char x: second.toCharArray()) {
            secondMap.put(x, secondMap.getOrDefault(x, 0)+1);
        }

        // 두 문자열에서 사용된 단어를 HashSet에 저장한다.(중복제거됨)
        HashSet<Character> keySet = new HashSet<>();
        keySet.addAll(firstMap.keySet());
        keySet.addAll(secondMap.keySet());

        // 두 문자열에서 단어에 대한 개수가 동일한지 확인한다.
        for (char key: keySet) {
            if (firstMap.getOrDefault(key, 0) != secondMap.getOrDefault(key, 0)) {
                return "NO";
            }
        }
        return "YES";
    }
}