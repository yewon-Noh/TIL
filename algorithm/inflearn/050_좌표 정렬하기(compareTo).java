import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> array = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            array.add(new Point(x, y));
        }
        Collections.sort(array);
        for (Point p: array) {
            System.out.println(p.getX() + " " + p.getY());
        }
    }

}
