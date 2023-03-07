import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] array = new int[s];
        for (int i=0; i<s; i++) array[i]=in.nextInt();
        System.out.println(T.solution(s, n, array));
    }

    public int solution(int size, int n, int[] array) {
        int answer = 0;
        Arrays.sort(array);

        int low = 0, high = size-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (n > array[mid]) low = mid+1;
            else if (n < array[mid]) high=mid-1;
            else if (n == array[mid]) return mid+1;
        }
        return answer;
    }
}
