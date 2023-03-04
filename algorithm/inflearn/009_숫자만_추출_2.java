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

        for (char x: str.toCharArray()) {
            // 아스키코드 값을 이용해 0~9 사이의 문자인지 확인
            if (x>='0' && x<='9')
                // 맞는 경우 answer로 저장
                answer = answer*10+(x-48);
        }
        return answer;
    }
}