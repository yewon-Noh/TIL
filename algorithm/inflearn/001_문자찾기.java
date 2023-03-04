import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        char c = in.next().charAt(0);
        System.out.println(T.solution(str, c));
    }

    public int solution(String str, char c) {
        int answer = 0;

        for(char x: str.toCharArray()) {
            if(Character.toUpperCase(x) == Character.toUpperCase(c)) answer++;
        }

        return answer;
    }
}