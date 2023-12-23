package figure;
import static java.lang.Math.*;

public class Point {
    private double x;
    private double y;
    
    static int counter;
    
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    
        counter++;
    }

    
    public double distance(Point dest){
        return sqrt(pow(dest.x-this.x,2)+pow(dest.y-this.y,2));
    }

    
    public String toString(){
        return "added "+counter+" side ";
    }
}
