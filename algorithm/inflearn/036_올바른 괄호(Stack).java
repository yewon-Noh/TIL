import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    // Stack을 사용하는 대표적인 문제
    public String solution(String str) {
        String answer = "NO";

        // 스택을 만든다.
        Stack<Character> stack = new Stack<>();
        // '(' 일 경우 스택에 추가(push)하고, ')' 일 경우 스택에서 제거(pop)한다.
        for (char x: str.toCharArray()) {
            if (x=='(') stack.push(x);
            else {
                if (stack.empty()) return "NO";  // ')'의 차례이나 스택이 비어있으면 "NO" 반환
                stack.pop();
            }
        }
        // 스택이 비어있는 경우 '('와 ')'의 개수가 동일 한 것이므로 "YES"를 반환한다.
        if (stack.empty()) return "YES";

        return answer;
    }
}