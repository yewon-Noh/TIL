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
        int MIN_VALUE = Integer.MIN_VALUE, pos;

        // indexOf 함수를 이용해 처음 공백이 나타나는 위치 구함(없을 경우 -1 반환)
        // 단어가 하나 남을때까지 반복
        while ((pos = str.indexOf(" ")) != -1) {
            String s = str.substring(0, pos);
            if (s.length() > MIN_VALUE) {
                MIN_VALUE = s.length();
                answer = s;
            }
            // 검색한 단어를 제외하고 다시 문장으로 저장
            str = str.substring(pos+1);
        }
        // 마지막 남은 단어 검색
        if (str.length() > MIN_VALUE) {
            MIN_VALUE = str.length();
            answer = str;
        }
        return answer;
    }
}