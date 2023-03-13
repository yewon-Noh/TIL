import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        for (int i=0; i<N; i++) array[i] = in.nextInt();
        for (int i: T.solution(N, array)) System.out.println(i);
    }

    public int[] solution(int N, int[] array) {
        int[] answer = array;

        for (int i=1; i<N; i++) {
            for (int j=i-1; j>=0; j--) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return answer;
    }
}