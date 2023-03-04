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

        for (char x: str.toCharArray()) {
            // ASCII 코드 값이 90(Z) 초과이면 소문자로 간주한다.
            if(x > 90) {
                answer += Character.toUpperCase(x);
                
            // ASCII 코드 값이 90(Z) 이하면 대문자로 간주한다.
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }
}