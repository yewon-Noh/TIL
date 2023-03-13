import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        for (int i: T.solution(n)) System.out.println(i);
    }

    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        // n의 약수는 1~루트n 까지이다.
        // 참고 : https://dev-ku.tistory.com/278
        for (int i=2; i<=Math.sqrt(n); i++) {
            while (n%i==0) {
                n/=i;
                answer.add(i);
            }
        }
        if (n!=1) answer.add(n);
        
        return answer;
    }
}
