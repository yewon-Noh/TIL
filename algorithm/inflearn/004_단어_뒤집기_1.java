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

    // 임시 변수를 이용하여 Swap
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x: str) {
            char c[] = x.toCharArray();
            int lt = 0, rt = c.length-1;

            while (lt<rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++; rt--;
            }
            answer.add(String.valueOf(c));
        }
        return answer;
    }
}