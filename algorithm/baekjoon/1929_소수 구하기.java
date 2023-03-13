import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for (int i: T.solution(m, n)) System.out.println(i);
    }

    public ArrayList<Integer> solution(int m, int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=m; i<=n; i++) {
            boolean check = true;
            if (i==1) check = false;
            for (int j=2; j<=Math.sqrt(i); j++) {
                if (i%j==0) {
                    check = false; break;
                }
            }
            if (check) answer.add(i);
        }
        return answer;
    }
}

