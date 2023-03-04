import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) array[i] = in.nextInt();
        System.out.println(T.solution(n, array));
    }

    public String solution(int n, int[] array) {
        Arrays.sort(array);
        for (int i=0; i<n-1; i++) {
            if (array[i] == array[i+1]) return "D";
        }
        return "U";
    }
}