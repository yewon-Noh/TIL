import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }
        for (int x: T.solution(n, array)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int n, int[] array) {
        int[] answer = new int[n];

        for(int i=0; i<n; i++) {
            int count = 1;
            for (int j=0; j<n; j++) {
                // 현재의 수 보다 큰 값이 있는 경우 count 1 증가시킨다.
                if (array[i] < array[j]) count++;
            }
            answer[i] = count;
        }

        return answer;
    }
}