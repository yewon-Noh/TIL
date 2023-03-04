import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        int MIN_VALUE = Integer.MIN_VALUE;

        for (String s: str.split(" ")) {
            if(s.length() > MIN_VALUE) {
                answer = s;
                MIN_VALUE = s.length();
            }
        }
        return answer;
    }
}