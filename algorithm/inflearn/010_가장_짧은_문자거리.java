import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        for (int i: T.solution(str, c)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

				// 원활한 비교를 위해 매우 큰 값을 넣어둔다.
        int p = 1000;

        // 왼쪽부터 문자 c와의 거리를 계산해 배열에 저장한다.
        for (int i=0; i<str.length(); i++) {
            // 검색한 문자가 c와 같은 경우 거리를 0으로 초기화한다.
            if (str.charAt(i) == c) p=0;
            // c가 아닌 경우 거리를 1증가한다.
            else p++;

            answer[i] = p;
        }

        // 오른쪽부터 문자 c와의 거리를 계산한다.
        for (int i=str.length()-1; i>=0; i--) {

            if (str.charAt(i) == c) p=0;
            else p++;

            // 왼쪽부터 검색한 값과 비교하여 더 작은 값을 저장한다.
            answer[i] = Math.min(answer[i], p);
        }

        return answer;
    }
}