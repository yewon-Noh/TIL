import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    /**
     * lt, rt 임시변수를 이용하여 반복
     * @param str
     * @return
     */
    public String solution(String str) {
        String answer = "YES";

        // 대소문자를 구분하지 않기 위해 모두 대문자로 변경한다.
        str = str.toUpperCase();

        // lt는 문자열의 좌측, rt는 우측 인덱스를 지정한다.
        int lt=0, rt=str.length()-1;
        // lt가 rt 보다 작을 경우에만 반복한다.
        while (lt < rt) {
            // 처음과 끝 인덱스의 문자를 비교한다.
            if (! (str.charAt(lt) == str.charAt(rt))) {
                // 두 문자가 다를 경우 "NO"를 반환한다.
                return "NO";
            }
            lt++; rt--;
        }

        return answer;
    }
}