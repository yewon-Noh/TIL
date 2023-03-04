import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<int[]>();
        while(true) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int s = in.nextInt();
            if (n1==0 && n2==0 && s==0) {
                break;
            }
            int[] array = {n1, n2, s};
            list.add(array);
        }
        
        for (String answer: T.solution(list)) {
            System.out.println(answer);
        }
    }

    public ArrayList<String> solution(ArrayList<int[]> list) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int[] array: list) {
            Arrays.sort(array);
            if (Math.pow(array[0], 2) + Math.pow(array[1], 2) == Math.pow(array[2], 2))
                answer.add("right");
            else 
                answer.add("wrong");
        }
        return answer;
    }
}