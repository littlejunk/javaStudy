public class TestEight {
	public static void main(String[] args) {
	      testCircle2D();	
	}
	
	public static void testCircle2D(){
		Cirle2D c1 = new Cirle2D(new Point(2, 2), 5.2);
		System.out.println(c1.contain(3, 3));
		System.out.println(c1.contain(new Cirle2D(new Point(4, 5), 10.5)));
		System.out.println(c1.overlaps(new Cirle2D(new Point(3, 5),2.3)));
	}
}


class QuadraticEquation {
	  private double[] nums;
	  
	  public QuadraticEquation(double newA, double newB, double newC) {
	       nums = new double[3];
	       nums[0] = newA;
	       nums[1] = newB;
	       nums[2] = newC;
	  }
	  public double getA() { return nums[0]; }
	  public double getB() { return nums[1]; }
	  public double getC() { return nums[2]; }
	  public double getDiscriminant() { return nums[1] * nums[1] - 4 * nums[0] * nums[2]; }
	  public double getRoot1() {
	    if (getDiscriminant() < 0)
	          return 0;
	    else {
	          return (-nums[1] + getDiscriminant()) / (2 * nums[2]);
	   }
	  }
	 public double getRoot2() {
	    if (getDiscriminant() < 0)
	        return 0;
	   else {
	        return (-nums[1] - getDiscriminant()) / (2 * nums[0]);
	   }
	 }
}

class Point {
    private double x;
    private double y;

    public Point(){
    	x=0;
    	y=0;
    }
    public Point(double initialX, double initialY) {
        x = initialX;
        y = initialY;
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Shifts this Point's location by the given amount.
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public static double distance(double x1, double y1,double x2,double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
  
    public static double distance(Point p1, Point p2) {
    	return Point.distance(p1.getX(),p1.getY(),p2.getX(),p2.getY());    
        
    }
    public  double distance(Point p2) {
        return Point.distance(this,p2);
    }
    public double getX() { return this.x;}
    public double getY() { return this.y;}

}

class Cirle2D{
	private Point p;
	
	private double radius;
	
	public Cirle2D() {
		p = new Point(0, 0);
		radius = 1;
	}
	
	public Cirle2D(Point p,double radius) {
		this.p = p;
		this.radius = radius;
	}
	
	public  Point getPoint() {
		return p;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public boolean contain(double x,double y) {
		if(p.distance(new Point(x,y))<radius) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean contain(Point Point) {
		return contain(Point.getX(), Point.getY());
	}
	
	public boolean contain(Cirle2D cirle2d) {
		if(cirle2d.radius<radius){
		return Math.abs(p.distance(cirle2d.getPoint()))<Math.abs(radius-cirle2d.radius);
		}else {
			return false;
		}
	}
	
	public boolean overlaps(Cirle2D cirle){
		double d = Point.distance(p, cirle.p);
		double R = Math.abs(radius-cirle.radius);
		double r = Math.abs(radius+cirle.radius);
		if(d<R&&d>r){
			return true;
		}else {
			return false;
		}
	}
	
	
}
