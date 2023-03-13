import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(T.solution(N));
    }

    public int solution(int N) {
        int answer=1, range=2;
        if (N==1) return answer;
        while (range <= N) {
            range += answer*6;
            answer++;
        }
        return answer;
    }
}
