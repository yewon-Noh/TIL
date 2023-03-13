import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.y == o.y) return this.x - o.x;
        else return this.y - o.y;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for (int i=0; i<N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            points.add(new Point(x, y));
        }
        Collections.sort(points);
        for (Point p: points) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
