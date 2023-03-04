import java.util.ArrayList;
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
        for (int x: T.solution(array)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int num: array) {
            // 1. 숫자를 뒤집는다.
            int res = reverseNum(num);
            // 2. 소수 일 경우 answer에 추가한다.
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }

    // 숫자를 뒤집는 함수
    public int reverseNum(int num) {
        int res = 0;
        while (num != 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }

    // 소수인지 여부를 구하는 함수
    public boolean isPrime(int num) {
        // 1은 소수가 아니다.
        if (num == 1) return false;
        
        for (int i=2; i<num; i++) {
            // 2~(n-1) 중 약수가 존재하면 소수가 아니다.
            if (num % i == 0) return false;
        }

        return true;
    }
}