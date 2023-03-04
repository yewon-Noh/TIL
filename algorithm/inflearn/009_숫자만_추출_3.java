import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        int answer = 0;

        String tmp = "";
        for (char x: str.toCharArray()) {
            // Character.isDigit를 이용하여 숫자인 문자만 저장
            if (Character.isDigit(x)) tmp += x;
        }

        answer = Integer.parseInt(tmp);
        return answer;
    }
}