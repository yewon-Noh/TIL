import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();  // 학생 수
        int m = in.nextInt();  // 테스트 개수
        int[][] array = new int[m][n];  // 등수
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, m, array));
    }

    public int solution(int n, int m, int[][] array) {
        int answer = 0;

        // 비교를 위해 학생 수 만큼 이중 for문으로 반복한다.
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                int count = 0;  // (i,j) 짝이 될 수 있는 횟수
                for (int k=0; k<m; k++) {
                    int pi = 0, pj = 0;
                    // i,j 학생의 등수를 pi, pj에 저장한다.
                    for (int s=0; s<n; s++) {
                        if (array[k][s] == i) pi=s;
                        if (array[k][s] == j) pj=s;
                    }
                    // pi가 pj보다 등수가 낮은 경우 짝이 될 수 있다.
                    if (pi < pj) count++;
                }
                // 모든 테스트에서 짝이 될 수 있어야한다.
                if (count==m) answer++;
            }
        }

        return answer;
    }
}
