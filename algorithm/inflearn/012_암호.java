import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();
        System.out.println(T.solution(num, str));
    }

    public String solution(int num, String str) {
        String answer = "";

        for (int i=0; i<num; i++) {
            // 암호는 알파벳 한 문자마다 일곱 개로 구성되어 있으므로, 7자리씩 자른다.
            String code = str.length() > 7 ? str.substring(0, 7) : str;
            str = str.substring(7);

            // 규칙에 따라 1 또는 0으로 변환한다.
            code = code.replace('#','1').replace('*','0');

            // 변환한 code 값(문자)을 2진수로 변환 후 다시 문자로 변경해 저장한다.
            answer += (char) Integer.parseInt(code, 2);
        }

        return answer;
    }
}