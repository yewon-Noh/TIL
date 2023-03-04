import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) array[i] = in.nextInt();
        System.out.println(T.solution(n, array));
    }

    // 시간복잡도가 O(1) 이므로 젤 좋음
    // - 참고 : https://www.grepiu.com/post/9
    public String solution(int n, int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: array) {
            if (map.containsKey(i)) return "D";
            map.put(i, 0);
        }
        return "U";
    }
}