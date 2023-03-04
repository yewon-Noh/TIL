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

        // 마지막 문자 비교를 위해 빈 문자 추가
        str += " ";

        // count 값을 1로 초기화
        int count = 1;
        
        for (int i=0; i<str.length()-1; i++) {
            // 현재 문자가 다음 문자와 같은 경우 중복된다고 판단, count 1 증가
            if (str.charAt(i) == str.charAt(i+1)) count++;
            
            // 다를 경우 answer에 결과 저장
            else {
                // 문자를 하나만 추가한 뒤,
                answer += str.charAt(i);
                // 반복된 횟수가 2이상인 경우 count를 추가해준다.
                if (count > 1) answer += count;
                // count는 1로 초기화한다.
                count = 1;
            }
        }
        return answer;
    }
}