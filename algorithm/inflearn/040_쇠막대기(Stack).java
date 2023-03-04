import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        // 규칙
        // 1. 여는 괄호와 닫는 괄호가 연속적으로 나온 경우는 레이저이다.
        //    레이저의 경우, 막대의 수 만큼 answer을 증가시킨다.
        // 2. 연속적이지 않는 경우는 막대의 끝을 의미한다.
        //    anwer을 1 증가시키면 된다.

//        char pre = '0';
//        for (char x: str.toCharArray()) {
//            if (x=='(') stack.push('(');
//            else if (x==')') {
//                if (pre=='(') {
//                    stack.pop();
//                    answer += stack.size();
//                } else {
//                    stack.pop();
//                    answer++;
//                }
//            }
//            pre=x;
//        }

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='(') stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i-1)=='(') answer+= stack.size();
                else answer++;
            }
        }

        return answer;
    }
}
