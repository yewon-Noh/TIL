import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();  // 수열 N
        int k = in.nextInt();  // 변경가능 횟수 k
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(T.solution(n, k, array));
    }

    public int solution(int n, int k, int[] array) {
        int answer = 0, cnt = 0;  // cnt는 0을 1로 바꾼 횟수

        int lt = 0;
        for (int rt=0; rt<n; rt++) {
            // 0을 만나면 무조건 1로 바꾼다.(cnt 증가)
            if (array[rt] == 0) cnt++;

            // 만약 cnt가 k를 넘어가지 않는지 확인한다.
            // 넘어가는 경우,
            // lt가 0을 만날때까지 반복하며, lt 좌표를 한칸씩 이동시킨다.
            while (cnt > k) {
                if (array[lt]==0) cnt--;
                lt++;
            }

            // answer보다 현재 위치(rt-lt+1) 크면 anser에 저장한다.
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }
}