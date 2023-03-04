import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) array[i]=in.nextInt();
        for (int i: T.solution(s, n, array)) System.out.print(i + " ");
    }

    public int[] solution(int size, int n, int[] array) {
        // 작업 흐름
        // size 만큼의 작업을 할 수 있다.
        // n개의 작업이 주어진다.
        // 해야할 작업이 캐시에 있는 경우는 해당 작업을 맨 앞으로 위치한다.
        // 해야할 작업이 캐시에 없는 경우에는 모든 작업을 뒤로 미루고 맨 앞에 위치한다.
        int[] cache = new int[size];

        for (int job: array) {
            int pos = -1;
            // 해야할 작업이 캐시에 있는지 확인한다.
            for (int i=0; i<size; i++) { if (cache[i]==job) pos = i; }

            // 없는 경우, 모든 작업을 뒤로 미룬다.
            if (pos == -1)
                for (int i=size-1; i>0; i--) { cache[i] = cache[i-1]; }

            // 있는 경우, 원래 있던 작업보다 앞에 있던 작업들을 뒤로 미룬다.
            else
                for (int i=pos; i>0; i--) { cache[i] = cache[i-1]; }

            // 작업을 맨 앞에 추가한다.
            cache[0] = job;
        }
        return cache;
    }
}
