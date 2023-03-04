import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        // 스택에 문자를 저장하다가
        // ')'를 만나면 스택에 저장된 '('를 만날때까지 원소를 제거한다.
        for (char x: str.toCharArray()) {
            if (x==')') {
                while (stack.pop() != '(');
            }
            else stack.push(x);
        }

        for (int i=0; i<stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
}
