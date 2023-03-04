import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++)
            str[i] = in.next();
        for (String answer : T.solution(str)) {
            System.out.println(answer);
        }
    }
    
    /**
     * SpringBuilder
     *
     * 문자열을 추가하거나 변경할 때 사용할 수 있다.
     * 덧셈(+) 연산을 통해 String 문자열을 결합하는 것에 비해 공간의 낭비, 속도 느림이 적다.
     * 멀티스레드 환경에서는 StringBuffer를 사용한다.
     * @param str
     * @return
     */
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x: str) {
            StringBuilder sb = new StringBuilder(x);
            String tmp = sb.reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
}