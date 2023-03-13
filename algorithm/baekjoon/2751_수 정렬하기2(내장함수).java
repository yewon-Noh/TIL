import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i<N; i++) {
            array.add(in.nextInt());
        }

        /**
         * Arrays.sort()는 primitive arrays에 대해 Dual-Pivot Quicksort 을 수행한다.
         * 평균 시간복잡도가 O(nlogn)이지만 최악의 경우 시간복잡도는 O(n^2)
         * 따라서 시간 초과 발생
         *
         * 방법 1. Scanner + Collections.sort
         * 방법 2. BufferedReader + Collections.sort
         * 방법 3. BufferedReader + Counting Sort
         */
        Collections.sort(array);

        for (int value: array) sb.append(value).append('\n');
        System.out.println(sb);
    }
}

