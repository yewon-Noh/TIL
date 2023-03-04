import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    /**
     * indexOf
     * 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며, 만약 찾지 못했을 경우 -1을 반환한다.
     * @param str
     * @return
     */
    public String solution(String str) {
        String answer = "";
        for (int i=0; i<str.length(); i++) {
            // 현재 인덱스에 해당하는 문자를 저장한다.
            char c = str.charAt(i);
            // 문자 c가 처음 발견되는 인덱스가 현재 인덱스와 동일한지 확인한다.
            if (str.indexOf(c) == i) {
                // 동일한 경우에만, 해당 문자가 처음 나왔음으로 판단하고
                // 해당 문자를 answer에 저장한다.
                answer += c;
            }
        }
        return answer;
    }
}