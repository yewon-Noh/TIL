import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }

    /**
     * 주의! 특수문자의 위치는 고정되고 영어 알파벳의 위치만 바뀌도록 해야한다.
     * @param str
     * @return
     */
    public String solution(String str) {
        String answer = "";

        char[] c = str.toCharArray();
        int lt=0, rt=str.length()-1;
        while (lt<rt) {
            // 문자가 영어 알파벳이 맞는지 확인한다.
            // 알파벳이 아닌 경우 한칸 이동하도록 한다.
            if (!Character.isAlphabetic(c[lt])) {
                lt++; continue;
            }
            if (!Character.isAlphabetic(c[rt])) {
                rt--; continue;
            }
            // 위치를 바꾼다.
            char tmp = c[lt];
            c[lt] = c[rt];
            c[rt] = tmp;
            lt++; rt--;
        }
        answer = String.valueOf(c);
        return answer;
    }
}