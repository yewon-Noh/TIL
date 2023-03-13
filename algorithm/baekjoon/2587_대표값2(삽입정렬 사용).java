import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        for (int i=0; i<5; i++) array[i] = in.nextInt();

        // 삽입정렬 사용
        int sum = array[0];
        for (int i=1; i<array.length; i++) {
            sum += array[i];
            for (int j=i-1; j>=0; j--) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        System.out.println(sum/5);
        System.out.println(array[2]);
    }
}