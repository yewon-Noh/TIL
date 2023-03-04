import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        for (int i=0; i<n; i++) {
            b[i] = in.nextInt();
        }
        for (String s:
             T.solution(n, a, b)) {
            System.out.println(s);
        }
    }

    public ArrayList<String> solution(int n, int[] a, int[] b) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i=0; i<n; i++) {
            // 비기는 경우
            if (a[i] == b[i])
                answer.add("D");
            // A가 이기는 경우
            else if (((a[i]==1) && (b[i]==3)) || ((a[i]==2) && (b[i]==1)) || ((a[i]==3) && (b[i]==2)))
                answer.add("A");
            // B가 이기는 경우
            else
                answer.add("B");
        }
        return answer;
    }
}