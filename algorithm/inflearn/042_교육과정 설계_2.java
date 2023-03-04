import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(T.solution(a, b));
    }

    // 내가 푼 풀이
    public String solution(String a, String b) {
        String answer = "NO";

        Queue<Character> queue_a = new LinkedList<>();  // 필수 과목
        Queue<Character> queue_b = new LinkedList<>();  // 설계한 과목
        for (char x: a.toCharArray()) {
            queue_a.offer(x);
        }
        // 설계한 과목 중 필수 과목만 queue_b에 저장
        for (char x: b.toCharArray()) {
            if (queue_a.contains(x)) queue_b.offer(x);
        }
        // queue_a와 queue_b가 같은지 확인
        if (queue_a.equals(queue_b)) return "YES";
        return answer;
    }
}
