package One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    /**
     * class One,
     * No Constructor/ Default Constructor,
     * Main method
     */

    public static void main(String[] args) {
        System.out.println("Welcome to One");
        Point one = new Point(12, 13, 17);
        Point two = new Point(12, 13, 17);

        Data db = new Data();
        db.addPoint(one);
        db.addPoint(two);

        db.displayPoints();

        WorkingWithArrays arr = new WorkingWithArrays("1,2,3");
    }
}

class Point {
    private int x, y, z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Point successfully createe");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Point (x:%d, y:%d, z:%d)", x, y, z);
    }
}

class Data {
    private List<Point> points = new ArrayList<>();

    public String addPoint(Point point) {
        points.add(point);
        return "Successfully added a point";
    }

    public void displayPoints() {
        for (Point x : points) {
            System.out.println(x);
        }
    }
}

class WorkingWithArrays {
    int[] OneD;
    int[][] TwoD;
    int[][][] ThreeD;

    /**
     * 
     * @param oneDString
     *                   This string should be seperated with a comma
     */
    public WorkingWithArrays(String oneDString) {
        // OneD = Arrays.stream(oneDString.split(",")).map((x) -> {
        // System.out.println(x);
        // return Integer.parseInt(x);
        // }).collect(collector);
        System.out.println("Working with arrays");

    }
}