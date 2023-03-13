import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int k = in.nextInt();
        Integer[] scores = new Integer[N];
        for (int i=0; i<N; i++) scores[i] = in.nextInt();

        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println(scores[k-1]);
    }
}
