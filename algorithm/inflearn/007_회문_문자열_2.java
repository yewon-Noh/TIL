import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    /**
     * equalsIgnoreCase
     * 대소문자를 무시하고 비교
     * @param str
     * @return
     */
    public String solution(String str) {
        String answer = "YES";

        // StringBuffer.reverse 를 이용하여 문자열을 뒤집에 저장한다.
        String tmp = new StringBuffer(str).reverse().toString();

        // 기존 문자열 str과 뒤집은 문자열 tmp를 대소문자를 무시하고 비교한다.
        // 두 문자가 다를 경우 "NO"를 반환한다.
        if (!str.equalsIgnoreCase(tmp))  return "NO";

        return answer;
    }
}