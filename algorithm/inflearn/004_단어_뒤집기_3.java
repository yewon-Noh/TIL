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
     * 뒤부터 문자를 가져와 문자열로 생성
     * charAt(i) : i 번째 문자를 가져온다.
     *
     * @param str
     * @return
     */
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x: str) {
            String tmp = "";
            for (int i=x.length()-1; i>=0; ) {
                tmp += x.charAt(i--);
            }
            answer.add(tmp);
        }
        return answer;
    }
}