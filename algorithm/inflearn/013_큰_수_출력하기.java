import java.util.ArrayList;
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
        for (int a: T.solution(array)) {
            System.out.print(a + " ");
        }
    }

    public ArrayList<Integer> solution(int[] array) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        // 첫번째 정수는 그냥 answer에 담는다.
        answer.add(array[0]);
        
        for (int i=1; i<array.length; i++) {
            // 자신의 바로 앞 수보다 큰 수면 answer에 담는다.
            if (array[i] > array[i-1]) answer.add(array[i]);
        }

        return answer;
    }
}