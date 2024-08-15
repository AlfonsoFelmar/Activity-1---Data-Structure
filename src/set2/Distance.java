package set2;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
/**
 *
 * @author felmaralfonso
 */
public class Distance {

public double x1;
public double x2;
public double y1;
public double y2;
public double radius;

    public Distance( double x1, double x2, double y1, double y2, double radius){
        
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.radius = radius;
        
        equation();
        
    }


public void equation(){
    
    double sum = radius * Math.acos(sin(x1) *  sin(x2) + cos(x1) * cos(x2) * cos(y1-y2));
    System.out.println("The calculation is "+sum);
    
}



    
}
