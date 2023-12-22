package figure;

import java.util.ArrayList;

//The Shape class should be able to calculate the perimeter of shape, find the longest and average sides of the shape.
public class Shape {
    static ArrayList<Point> points=new ArrayList<>();
    public void addPoint(Point xy){
        points.add(xy);
    }

    double Perimeter(){
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1)%points.size());
            perimeter += currentPoint.distance(nextPoint);
        }
        return perimeter;
    }

    public String getPerimeter(){
        return "Perimetr = "+ Perimeter();
    }
    public String getAverageSide(){
        return "Average side = "+ (Perimeter()/points.size());
    }

    double longestSide(){
        double max = 0;
        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            double distance = currentPoint.distance(nextPoint);
            if (max<distance) {
                max = distance;
            }
        }
        return max;
    }

    public String getLongestSide(){
        return "Longest side = "+ longestSide();
    }
}
