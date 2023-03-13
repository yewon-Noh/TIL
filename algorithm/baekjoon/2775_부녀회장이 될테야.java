import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        for (int i=0; i<N; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("A", in.nextInt());
            map.put("B", in.nextInt());
            list.add(map);
        }
        for (int x: T.solution(N, list)) System.out.println(x);
    }

    public int[] solution(int n, ArrayList<HashMap<String, Integer>> list) {
        int[] answer = new int[n];

        int[][] APT = new int[15][15];
        for (int i=0; i<15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for (int i=1; i<15; i++) {          // 1충부터 14층까지
            for (int j=2; j<15; j++) {      // 2호부터 14호까지
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }

        int index=0;
        for (HashMap<String, Integer> map : list) {
            int a = map.get("A");
            int b = map.get("B");
            answer[index++] = APT[a][b];
        }

        return answer;
    }
}
