import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";

        // 알파벳 외의 문자 제거 (^는 ~가 아닌것을 의미)
        str = str.replaceAll("[^a-zA-Z]", "");

        // 문자를 뒤집에 저장
        String tmp = new StringBuffer(str).reverse().toString();

        // 팰린드롬인지 비교(대소문자 무시)
        if (str.equalsIgnoreCase(tmp)) answer="YES";
        else answer="NO";

        return answer;
    }
}