import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(T.solution(str1, str2));
    }

    /**
     * str1에서 str2와 아나그램이 되는 부분 문자열의 개수를 구한다.
     */
    public int solution(String str1, String str2) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for (char x: str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }
        
        // sliding window를 사용한다.
        // str2의 길이-1 까지의 단어를 hash map에 저장해둔다.
        int L = str2.length()-1;
        for (int i=0; i<L; i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
        }
        
        // str2의 길이부터 str1 문자열의 끝까지 반복하며 개수를 구한다.
        int lt = 0;
        for (int rt=L; rt<str1.length(); rt++) {
            // 오른쪽 문자를 map에 추가시킨다.
            map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt), 0)+1);
            // 아나그램인지 확인한다.
            if(map2.equals(map1)) answer++;
            
            // 왼쪽 문자 하나를 map에서 제거한다.
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt))-1);
            if (map1.get(str1.charAt(lt))==0) map1.remove(str1.charAt(lt));
            lt++;
        }
        
        return answer;
    }
}