import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[j][i] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i=0; i<m; i++) {
            moves[i] = in.nextInt();
        }
        System.out.println(T.solution(n, m, board, moves));
    }

    // Stack을 사용하는 대표적인 문제
    public int solution(int n, int m, int[][] board, int[] moves) {
        int answer = 0;

        // 바구니를 만든다.(스택)
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i=0; i<n; i++) {
                // 크레인이 멈춘 위치에 인형이 존재하는 경우
                if (board[pos-1][i] != 0) {
                    // 인형을 잡고, 원래 있던 위치에는 0으로 바꾼다.
                    int item=board[pos-1][i];
                    board[pos-1][i] = 0;

                    // 인형을 바구니에 넣기 전, 바구니 최상단(stack.peek())의 인형과 비교를 수행한다.
                    // 만약 최상단의 인형과 동일할 경우, 바구니에 넣지 않고 최상단의 인형 또한 제거한다.
                    if (!stack.isEmpty() && item==stack.peek()) {
                        answer+=2;
                        stack.pop();
                    }
                    // 동일하지 않으면 인형을 바구니에 넣는다.
                    else stack.push(item);
                    // 크레인이 한 번 동작하면 반드시 멈춰야한다.
                    break;
                }
            }
        }
        return answer;
    }
}
