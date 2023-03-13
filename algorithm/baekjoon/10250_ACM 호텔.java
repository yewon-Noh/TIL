import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[][] array = new int[a][3];
        for (int i=0; i<a; i++) {
            for (int j=0; j<3; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for (int x: T.solution(a, array)) System.out.println(x);
    }

    public int[] solution(int n, int[][] array) {
        int[] answer = new int[n];

        for (int i=0; i<n; i++) {
            int H = array[i][0];
            int W = array[i][1];
            int N = array[i][2];

            if (N%H == 0) {
                int X = H;
                int Y = N/H;
                answer[i] = X*100 + Y;
            } else {
                int X = N%H;
                int Y = (N/H)+1;
                answer[i] = X*100 + Y;
            }
        }
        return answer;
    }
}
