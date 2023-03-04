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
        for (int i=0; i<array.length; i++) {
            if (search(i, array)) return "D";
        }
        return "U";
    }

    // 중복된 숫자가 존재하는지 확인
    private boolean search(int index, int[] array) {
        int num = array[index];
        for (int i=0; i<array.length; i++) {
            if (i != index && array[i] == num) {
                return true;
            }
        }
        return false;
    }
}