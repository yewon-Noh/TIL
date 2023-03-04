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
        System.out.println(T.solution(array));
    }

    public int solution(int[] array) {
        int answer = 1;

        int height = array[0];
        for (int i: array) {
            // 앞에 서 있는 사람들보다 키가 큰 경우
            if (i > height) {
                // answer 증가, 가장 큰 키로 저장
                answer++; height=i;
            }
        }
        return answer;
    }
}