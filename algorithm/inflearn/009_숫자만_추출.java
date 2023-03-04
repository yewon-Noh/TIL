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

        // 숫자 외의 문자 제거 (^는 ~가 아닌것을 의미)
        str = str.replaceAll("[^0-9]", "");

        // 정수형으로 변환
        answer = Integer.parseInt(str);
        return answer;
    }
}