import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][5];
        for (int i=0; i<n; i++) {
            for (int j=0; j<5; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, array));
    }


    public int solution(int n, int[][] array) {
        int answer = 0;
        int number = Integer.MIN_VALUE;

        // 1번~5번학생까지 n번 반복한다.
        for (int i=0; i<n; i++) {

            int count = 0;
            // 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람의 수를 구한다.
            for (int j=0; j<n; j++) {

//                if (j==i) continue;
                for (int z=0; z<5; z++) {
                    if (array[i][z] == array[j][z]) {
                        count++; break;
                    }
                }

            }
            // 같은 반이었던 사람이 가장 많은 사람이 반장이 된다.
            // 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.
            if (number < count) {
                answer = i;
                number = count;
            }
        }

        return answer+1;
    }
}
