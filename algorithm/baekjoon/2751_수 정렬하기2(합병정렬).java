import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int sorted[];

    static void merge(int[] arr, int left, int mid, int right) {
        int i=left, j=mid+1, k=left, l;

        while (i<=mid && j<=right) {
            if (arr[i]<=arr[j])
                sorted[k++] = arr[i++];
            else
                sorted[k++] = arr[j++];
        }
        
        while (j<=right) {
            sorted[k++] = arr[j++];
        }
        while (i<=mid) {
            sorted[k++] = arr[i++];
        }
        
        for (l = left; l<=right; l++) {
            arr[l] = sorted[l];
        }
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left<right) {
            int mid = (left+right)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        sorted = new int[n];

        for (int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        mergeSort(arr, 0, arr.length-1);

        for (int i=0; i<n; i++) sb.append(arr[i]).append('\n');
        System.out.println(sb);
    }
}
