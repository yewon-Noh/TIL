import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, array));
    }

    // 좌, 하, 우, 상
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public int solution(int n, int[][] array) {
        int answer = 0;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                boolean flag = true;
                for (int k=0; k<4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    // 인덱스가 0~(n-1) 사이인 경우에만 수행한다.
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                        // 현재 인덱스의 값이 주위 인덱스(nx, ny)보다 작거나 같으면 봉우리가 아니다.
                        if (array[i][j] <= array[nx][ny]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }
}