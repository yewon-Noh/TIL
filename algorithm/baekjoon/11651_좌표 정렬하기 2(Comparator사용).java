import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
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
        
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.y == o2.y) return o1.x - o2.x;
                else return o1.y - o2.y;
            }
        });
        for (Point p: points) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
