import figure.Shape;
import figure.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File points=new File("C:\\Users\\USER\\IdeaProjects\\assignment\\src\\source");
        Scanner read=new Scanner(points);
        Shape shape=new Shape();
        while (read.hasNext()){
            double x= read.nextDouble();
            double y=read.nextDouble();
            Point point=new Point(x,y);
            shape.addPoint(point);
       }
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongestSide());


    }
}
