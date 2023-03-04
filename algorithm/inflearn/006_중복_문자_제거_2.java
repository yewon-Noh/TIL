import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    /**
     * contains
     * 특정 문자열에 문자가 포함되어 있는지 여부를 반환한다.
     * @param str
     * @return
     */
    public String solution(String str) {
        String answer = "";
        for (char x: str.toCharArray()) {
            // 결과 문자열 answer에 문자열 x가 포함되어 있는지 확인한다.
            if(!answer.contains(String.valueOf(x)))
                // 포함되어 있지 않은 경우에만, answer에 저장한다.
                answer += x;
        }
        return answer;
    }
}